'use strict';
app
  .controller('HomeCtrl', ['$scope', 'User', function ($scope, User) {
      var user = User.getUserData();
      if (user.isAuthenticated){
    	  $scope.user = user; 
    	  
      }
  }]);