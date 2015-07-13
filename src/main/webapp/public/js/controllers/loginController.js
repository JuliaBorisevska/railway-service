'use strict';
app.controller('LoginCtrl', ['$scope', '$rootScope', '$modal', '$state', 'User', function ($scope, $rootScope, $modal, $state, User) {
    $scope.username = '';
    $scope.password = '';
    $scope.errors = [];
    $state.go($rootScope.previousState);
    var modalInstance = $modal.open({
        templateUrl: 'public/views/dialogs/login.html',
        controller: 'LoginDialogCtrl'
    });

  }]);