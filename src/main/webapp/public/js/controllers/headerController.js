'use strict';

app
  .controller('HeaderCtrl', ['$scope', '$state', 'User', function ($scope, $state, User) {
      var user = User.getUserData();
      //alert(JSON.stringify(user));
      if (user.isAuthenticated){
    	  $scope.user = user; 
      }else{
    	  $state.go('login'); 
      }
  }]);