'use strict';

var app = angular.module('mainModule', [
  'ngCookies',
  'ngResource',
  'ngSanitize',
  'ngRoute',
  'ui.router'
])
.config(function($stateProvider, $locationProvider, $urlRouterProvider) {
	  //$locationProvider.html5Mode(true);

	  $urlRouterProvider.otherwise("/login");

	  $stateProvider
	    .state('login', {
	      url: "/login",
	      templateUrl: "public/views/partials/login.html",
	      controller: 'LoginCtrl'
	    })
	    .state('home', {
	       url: "/home",
		   templateUrl: "public/views/partials/home.html",
		   controller: 'HeaderCtrl'
		 });
	});
