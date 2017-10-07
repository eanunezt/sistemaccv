'use strict';


// Declare app level module which depends on filters, and services
var app=angular.module('adminSistemaccv', [
  'ngRoute',
  'angularUtils.directives.dirPagination',
  'adminSistemaccv.controllers'
]);
app.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/', {templateUrl: 'partials/menu.html'});
	$routeProvider.when('/Repuesto', {templateUrl: 'partials/Repuesto.html', controller: 'RepuestoCtrl'});
	$routeProvider.when('/Proveedor', {templateUrl: 'partials/Proveedor.html', controller: 'ProveedorCtrl'});
	$routeProvider.when('/Vehiculo', {templateUrl: 'partials/Vehiculo.html', controller: 'VehiculoCtrl'});
	$routeProvider.when('/Importacion', {templateUrl: 'partials/Importacion.html', controller: 'ImportacionCtrl'});
	$routeProvider.when('/Cliente', {templateUrl: 'partials/Cliente.html', controller: 'ClienteCtrl'});
	$routeProvider.when('/Garantia', {templateUrl: 'partials/Garantia.html', controller: 'GarantiaCtrl'});
	$routeProvider.when('/Empleado', {templateUrl: 'partials/Empleado.html', controller: 'EmpleadoCtrl'});
	$routeProvider.when('/Ventas', {templateUrl: 'partials/Ventas.html', controller: 'VentasCtrl'});
	$routeProvider.when('/Preventa', {templateUrl: 'partials/Preventa.html', controller: 'PreventaCtrl'});
	
  	$routeProvider.otherwise({redirectTo: '/'}); 
}]);

var module=angular.module("adminSistemaccv.controllers",[]);
