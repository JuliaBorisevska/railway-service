'use strict';
app.controller('LoginDialogCtrl', ['$scope', '$modalInstance', '$state', 'User', function ($scope, $modalInstance, $state, User) {
    $scope.username = '';
    $scope.password = '';
    $scope.errors = [];

    function onSuccessfulLogin() {
    	$modalInstance.close();
        $state.go('home');
        alert("go home");
    }

    function onFailedLogin(error) {
      if (typeof error === 'string' && $scope.errors.indexOf(error) === -1) {
        $scope.errors.push(error);
      }
    }

    $scope.login = function() {
      User.authenticate($scope.username, $scope.password, onSuccessfulLogin, onFailedLogin);
      alert("auth");
    };
    

    $scope.close = function () {
    	$state.go('home');
        alert("go home");
        $modalInstance.close();
    };
    
  }]);