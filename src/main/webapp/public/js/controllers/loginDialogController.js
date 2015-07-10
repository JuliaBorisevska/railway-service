'use strict';
app.controller('LoginDialogCtrl', ['$scope', '$rootScope', '$modalInstance', '$state', 'User', function ($scope, $rootScope, $modalInstance, $state, User) {
    $scope.username = '';
    $scope.password = '';
    $scope.errors = [];

    function onSuccessfulLogin() {
    	$state.reload($rootScope.previousState);
    	$modalInstance.close();
    }

    function onFailedLogin(error) {
      if (typeof error === 'string' && $scope.errors.indexOf(error) === -1) {
        $scope.errors.push(error);
      }
    }

    $scope.login = function() {
        User.authenticate($scope.username, $scope.password, onSuccessfulLogin, onFailedLogin);
    };
    

    $scope.close = function () {
        $modalInstance.close();
    };
    
  }]);