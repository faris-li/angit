require.config({
    baseUrl: './',
    paths: {
        'angular': 'lib/angular/angular.min',
        'angular-ui-router': 'lib/angular-ui-router/release/angular-ui-router.min',
        'angular-async-loader': 'lib/angular-async-loader/angular-async-loader.min'
    },
    shim: {
        'angular': {exports: 'angular'},
        'angular-ui-router': {deps: ['angular']}
    }
});

require(['angular', './app-routes'], function (angular) {
    angular.element(document).ready(function () {
        angular.bootstrap(document, ['app']);
        angular.element(document).find('html').addClass('ng-app');
    });
});

