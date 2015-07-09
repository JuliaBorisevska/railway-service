'use strict';

var app = angular.module('mainModule', [
  'ngCookies',
  'ngResource',
  'ngSanitize',
  'ngRoute',
  'ui.router',
  'ui.bootstrap'
])
.config(function($stateProvider, $locationProvider, $urlRouterProvider) {
	  //$locationProvider.html5Mode(true);

	  $urlRouterProvider.otherwise("/home");

	  $stateProvider
	    /*.state('login', {
	      url: "/login",
	      templateUrl: "public/views/partials/login.html",
	      controller: 'LoginCtrl'
	    })
	    .state('home', {
	       url: "/home",
		   templateUrl: "public/views/partials/home.html",
		   controller: 'HomeCtrl'
		 })
		 .state('ticket', {
	       url: "/ticket",
		   templateUrl: "public/views/partials/ticket.html",
		   //controller: 'HomeCtrl'
		 })
		 .state('schedule', {
	       url: "/schedule",
		   templateUrl: "public/views/partials/schedule.html",
		   //controller: 'HomeCtrl'
		 })*/
	    .state('login', {
            url: "/login",
            views: {
                "viewA": {
                	templateUrl: "public/views/partials/header.html",
          	      	controller: 'HeaderCtrl'
                },
                "viewB": {
          	      	controller: 'LoginCtrl'
                }
            }
        })
        .state('home', {
            url: "/home",
            views: {
                "viewA": {
                	templateUrl: "public/views/partials/header.html",
          	      	controller: 'HeaderCtrl'
                },
                "viewB": {
                	templateUrl: "public/views/partials/home.html",
         		    controller: 'HomeCtrl'
                }
            }
        })
        .state('ticket', {
        	url: "/ticket",
            views: {
                "viewA": {
                	templateUrl: "public/views/partials/header.html",
          	      	controller: 'HeaderCtrl'
                },
                "viewB": {
                	templateUrl: "public/views/partials/ticket.html"
                }
            }
        })
        .state('schedule', {
        	url: "/schedule",
            views: {
                "viewA": {
                	templateUrl: "public/views/partials/header.html",
          	      	controller: 'HeaderCtrl'
                },
                "viewB": {
                	templateUrl: "public/views/partials/schedule.html"
                }
            }
        });
	});
