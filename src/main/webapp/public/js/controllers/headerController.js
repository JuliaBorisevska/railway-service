'use strict';
app
  .controller('HeaderCtrl', ['$scope', '$state', 'User', function ($scope, $state, User) {
      var user = User.getUserData();
      var anonymousLeftMenu = [{
          	name: 'Билеты',
          	go: 'ticket'
      	}, {
      		name: 'Расписание',
          	go: 'schedule'
      	}];
      var anonymousRightMenu = [{
      		name: 'Войти',
          	go: 'login',
          	style: 'glyphicon glyphicon-log-in'
      	}];
      var userLeftMenu = [{
          	name: 'Билеты',
          	go: 'ticket'
      	}, {
      		name: 'Расписание',
          	go: 'schedule'
      	}, {
      		name: 'Статистика',
          	go: 'schedule'
      	}];
      var userRightMenu = [{
      		name: 'Профиль',
          	go: 'login',
          	style: 'glyphicon glyphicon-user'
      	}, {
      		name: 'Выйти',
          	go: 'home',
          	style: 'glyphicon glyphicon-log-in'
      	}];
      //alert(JSON.stringify(user));
      if (user.isAuthenticated){
    	  $scope.leftMenu = userLeftMenu;
    	  $scope.rightMenu = userRightMenu;
    	  //$scope.user = user; 
    	  
      }else{
    	 // $state.go('login'); 
    	  $scope.leftMenu = anonymousLeftMenu;
    	  $scope.rightMenu = anonymousRightMenu;
      }
  }]);