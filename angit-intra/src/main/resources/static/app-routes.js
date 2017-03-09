define(function (require) {
    var app = require('./app');
    
    app.controller('OrderController', function ($scope, $stateParams){
    	
    });
    

	app.controller('ProtocolController', function($scope, $stateParams, $state,$http) {
		layui.define([ 'layer', 'laypage' ], function(exports) {
			var layer = layui.layer;
			layui.laypage({
			    cont: 'protocolPage'
			    ,pages: 100 //总页数
			    ,groups: 5 //连续显示分页数
			});
		});
	});
	app.controller('ProtocolFormController', function($scope, $stateParams, $state,$http) {
		layui.use(['form'], function(){
			var form = layui.form();
			//监听提交
			form.on('submit(formProtocol)', function(data){
				// layer.msg(JSON.stringify(data.field));
				$http.post("/protocol/saveData",data.field)
					.success(function(json){
						console.log(json);
						layer.msg("提交成功！");
						$state.go('app.protocol.list');
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
			url : '/form',
			templateUrl : 'views/protocol-form.html',
			controller : 'ProtocolFormController'
		});
        
    }]);
});
