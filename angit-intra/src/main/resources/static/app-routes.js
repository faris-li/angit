define(function (require) {
    var app = require('./app');
    
    app.controller('OrderController', function ($scope, $stateParams){
    	
    });
    

	app.controller('ProtocolController', function($scope, $stateParams, $state,$http) {
		$scope.params = {
            pageNum: 1,
            pageSize: 20,
            orderBy: ''
        };
		
		layui.define([ 'layer', 'laypage' ], function(exports) {
			$scope.search = function(){
				console.log($scope.params);
				$http.get("/protocol/listData",$scope.params)
				.success(function(json){
					console.log(json);
					layui.laypage({
					    cont: 'protocolPage'
					    ,pages: 100 //总页数
					    ,groups: 5 //连续显示分页数
					});
				});
			
			}
			
			$scope.search();
			
		});
		
		
		
	});
	app.controller('ProtocolFormController', function($scope, $stateParams, $state,$http) {
		var id = $state.params.id;
		console.log($state);
		if (!!id) { //编辑
			$scope.title = '编辑渠道';
		}else{
			$scope.title = '新增渠道';
		}
		layui.use(['form'], function(){
			var form = layui.form();
			//监听提交
			form.on('submit(formProtocol)', function(data){
				// layer.msg(JSON.stringify(data.field));
				$http.post("/protocol/saveData",data.field)
					.success(function(json){
						console.log(json);
						layer.msg("提交成功！");
						//$state.go('app.protocol.list');
						$state.go('app.protocol.form', {
	                        id: json.id
	                    });
	                    
					}).error(function(){
						
					});
			    return false;
			});
		  
		});
		
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
