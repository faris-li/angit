define(function (require, exports, module) {
    var angular = require('angular');
    var asyncLoader = require('angular-async-loader');
    
    require("angular-ui-router");
    
    var app = angular.module('app', ['ui.router']);
    
    app.constant('DICT_CONST', {
    	PROTOCOL_STATUS: [{
            key: 0,
            value: '初始'
        }, {
            key: 1,
            value: '可用'
        }, {
            key: 9,
            value: '不可用'
        }],
        ORDER_STATUS: [{
            key: '0',
            value: '初始'
        }, {
            key: '1',
            value: '支付成功'
        }, {
            key: '2',
            value: '支付失败'
        }],
        ORDER_C_STATUS: [{
            key: '0',
            value: '补单'
        }, {
            key: '1',
            value: '已补单'
        }, {
            key: '2',
            value: '已补单'
        }]
    })
    
    app.filter('dict', dict);

    dict.$inject = ['DICT_CONST'];
    function dict(DICT_CONST) {
        return function (key, type) {
            return getDict(key, type);
        };

        function getDict(key, type) {
            var value = key;

            var dictList;
            if (dictList = DICT_CONST[type]) {
                angular.forEach(dictList, function (dict) {
                    if (dict['key'] === key) {
                        value = dict['value'];
                    }
                })
            }
            return value;
        }
    }
    
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
