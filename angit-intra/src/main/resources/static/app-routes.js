define(function (require) {
    var app = require('./app');
    
    app.controller('OrderController', function($scope, $stateParams, $state,$http){
    	$scope.params = {
            pageNum: 1,
            pageSize: 8,
            orderBy: ''
        };
    	layui.use(['laydate','layer','laypage'], function(){
		  var laydate = layui.laydate;
		  
		  var start = {
		    max: '2099-06-16 23:59:59'
		    ,istoday: false
		    ,choose: function(datas){
		      end.min = datas; //开始日选好后，重置结束日的最小日期
		      end.start = datas //将结束日的初始值设定为开始日
		    }
		  };
		  
		  var end = {
		    min: laydate.now()
		    ,max: '2099-06-16 23:59:59'
		    ,istoday: false
		    ,choose: function(datas){
		      start.max = datas; //结束日选好后，重置开始日的最大日期
		    }
		  };
		  
		  document.getElementById('LAY_demorange_s').onclick = function(){
		    start.elem = this;
		    laydate(start);
		  }
		  document.getElementById('LAY_demorange_e').onclick = function(){
		    end.elem = this
		    laydate(end);
		  }
		  
		  
		  $scope.search = function(){
			    $scope.params.startTime = document.getElementById('LAY_demorange_s').value;
			    $scope.params.endTime = document.getElementById('LAY_demorange_e').value;
				$http.get("/order/listData",{params:$scope.params})
				.success(function(json){
					$scope.pageInfo = json;
					layui.laypage({
					    cont: 'divPage'
					    ,pages: json.pages //总页数
					    ,curr : $scope.params.pageNum || 1 // 当前页
					    ,jump: function(obj,first){
					    	if (!first) { 
						    	$scope.params.pageNum = obj.curr;
						    	$scope.search();
					    	}
					    }
					});
				});
			
		  }
		  $scope.search();
    	});
    	
    	$scope.repairOrder = function(id){
    		$http.get("/order/getData/"+id)
			.success(function(json){
				var html = '<table>';
	    		html += '<tr><td align="right">商户号：</td><td>'+json.appMerchantNo+'</td></tr>';
	    		html += '<tr><td align="right">商户名称：</td><td>'+json.appMerchantName+'</td></tr>';
	    		html += '<tr><td align="right">商户订单号：</td><td>'+json.appOrderNo+'</td></tr>';
	    		html += '<tr><td align="right">金额：</td><td>'+json.amount+'</td></tr>';
	    		html += '<tr><td align="right">渠道：</td><td>'+json.appName+'</td></tr>';
	    		html += '</table>';
	    		//示范一个公告层
	    	      layer.open({
	    	        type: 1
	    	        ,title: false //不显示标题栏
	    	        ,closeBtn: false
	    	        ,shadeClose:true
	    	        ,area: '300px;'
	    	        ,shade: 0.1
	    	        ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
	    	        ,btn: ['支付失败', '支付成功']
	    	        ,moveType: 1 //拖拽模式，0或者1
	    	        ,content: '<div style="padding: 30px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">'+html+'</div>'
	    	        ,success: function(layero){
	    	        	 var btn = layero.find('.layui-layer-btn');
	    	             btn.css('text-align', 'center');
	    	             btn.find("a").removeClass('layui-layer-btn0').addClass('layui-layer-btn1');
	    	             btn.find("a").eq(1).addClass('layui-layer-btn0').css("width","155px");
	    	        }
	    	      	,btn1:function(){
	    	      		layer.load();
	    	      		$http.get("/order/synAppOrders/"+id+"/2")
	    				.success(function(json){
	    					layer.closeAll();
	    					layer.msg('操作成功');
	    					$scope.search();
	    				});
	    	      	}
	    	      	,btn2:function(){
	    	      		layer.load();
	    	      		$http.get("/order/synAppOrders/"+id+"/1")
	    				.success(function(json){
	    					layer.closeAll();
	    					layer.msg('操作成功');
	    					$scope.search();
	    				});
	    	      	}
	    	      });
			}).error(function(){
				layer.msg("请求异常");
			});
    		
    	}
    	
    });
    

	app.controller('ProtocolController', function($scope, $stateParams, $state,$http) {
		$scope.params = {
            pageNum: 1,
            pageSize: 8,
            orderBy: ''
        };
		
		layui.define([ 'layer', 'laypage' ], function(exports) {
			$scope.search = function(){
				$http.get("/protocol/listData",{params:$scope.params})
				.success(function(json){
					$scope.pageInfo = json;
					layui.laypage({
					    cont: 'protocolPage'
					    ,pages: json.pages //总页数
					    ,curr : $scope.params.pageNum || 1 // 当前页
					    ,jump: function(obj,first){
					    	if (!first) { 
						    	$scope.params.pageNum = obj.curr;
						    	$scope.search();
					    	}
					    }
					});
				});
			
			}
			
			$scope.search();
			
		});
		
		
		
	});
	app.controller('ProtocolFormController', function($scope, $stateParams, $state,$http) {
		
		var id = $state.params.id;
		$scope.enabled = false;
		if (!!id) { //编辑
			$scope.title = '编辑渠道';
			$scope.enabled = true;
		}else{
			$scope.title = '新增渠道';
		}
		if (!!id) {
			$http.get("/protocol/getData/"+id)
			.success(function(json){
				$scope.protocol = json;
				layui.define(['form','layer'], function(){
					var form = layui.form(),$ = layui.jquery;//初始化表单
					$("#status").val(json.status);
					form.render();
				});
			}).error(function(){
				layer.msg("请求异常");
			});
        }
		$scope.saveData = function () {
			layer.load();
			$http.post("/protocol/saveData",$scope.protocol)
			.success(function(json){
				$state.go('app.protocol.form', {
                    id: json.id
                });
				layer.closeAll();
                layer.msg("提交成功！");
			}).error(function(){
				layer.msg("请求异常");
			});
		}
		$scope.updateData = function () {
			
			layui.define(['layer'], function(){
				var $ = layui.jquery;//初始化表单
				$scope.protocol.status = $("#status").val();
			});
			layer.load();
			$http.post("/protocol/updateData",$scope.protocol)
			.success(function(json){
				$state.go('app.protocol.form', {
                    id: json.id
                });
                layer.closeAll();
                layer.msg("提交成功！");
			}).error(function(){
				layer.msg("请求异常");
			});
		}
		
	});
    
    app.config(['$stateProvider', '$urlRouterProvider',function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise('/app/order');

        $stateProvider
        .state('app', {
            abstract: true,
            url: '/app',
            templateUrl: 'views/app.html'
        })
		.state('app.order', {
			url : '/order',
			templateUrl : 'views/order.html',
			controller : 'OrderController'
		})
		.state('app.protocol', {
			url : '/protocol',
			template: '<div ui-view></div>'
		})
		.state('app.protocol.list', {
			url : '/list',
			templateUrl : 'views/protocol.html',
			controller : 'ProtocolController'
		})
		.state('app.protocol.form', {
			url : '/form/{id}',
			templateUrl : 'views/protocol-form.html',
			controller : 'ProtocolFormController'
		});
        
    }]);
});
