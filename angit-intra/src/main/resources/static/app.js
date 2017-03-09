define(function (require, exports, module) {
    var angular = require('angular');
    var asyncLoader = require('angular-async-loader');
    
    require("angular-ui-router");
    
    var app = angular.module('app', ['ui.router']);
    
    app.run([
		'$state',
		'$stateParams',
		'$rootScope',
		function($state, $stateParams, $rootScope) {
			$rootScope.$state = $state;
			$rootScope.$stateParams = $stateParams;
			$rootScope.$on("$stateChangeSuccess", function(currentRoute,previousRoute) {//路由切换事件
				$rootScope.title = $state.current.title;
			});
		} ]);

    asyncLoader.configure(app);

    module.exports = app;
});
