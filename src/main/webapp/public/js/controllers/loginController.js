'use strict';
app.controller('LoginCtrl', ['$scope', '$state', 'User', function ($scope, $state, User) {
    $scope.username = '';
    $scope.password = '';
    $scope.errors = [];

    function onSuccessfulLogin() {
      $state.go('home');
    }

    function onFailedLogin(error) {
      if (typeof error === 'string' && $scope.errors.indexOf(error) === -1) {
        $scope.errors.push(error);
      }
    }

    $scope.login = function() {
      User.authenticate($scope.username, $scope.password, onSuccessfulLogin, onFailedLogin);
    };
  }]);