'use strict';
app.controller('LoginCtrl', ['$scope', '$modal', '$state', 'User', function ($scope, $modal, $state, User) {
    $scope.username = '';
    $scope.password = '';
    $scope.errors = [];

    var modalInstance = $modal.open({
        templateUrl: 'public/views/dialogs/login.html',
        controller: 'LoginDialogCtrl'
    });

    modalInstance.result.then(function (result) {
        if (result) {
        	alert("result");
            //record.name = result.name;
            //record.description = result.description;
        }
    }, function() {});
 /*   
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
*/
  }]);