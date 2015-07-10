'use strict';

app
  .service('Menu', [function Menu() {
	  var brand = {
      	name: 'TRAVEL',
      	go: 'home',
      	style: 'active'
  		};
	  var anonymousLeftMenu = [{
        	name: 'Билеты',
        	go: 'ticket',
        	style: 'simple'
    	}, {
    		name: 'Расписание',
        	go: 'schedule',
        	style: 'simple'
    	}];
	  var anonymousRightMenu = [{
    		name: 'Войти',
        	go: 'login',
        	style: 'glyphicon glyphicon-log-in'
    	}];
	  var userLeftMenu = [{
        	name: 'Билеты',
        	go: 'ticket',
        	style: 'simple'
    	}, {
    		name: 'Расписание',
        	go: 'schedule',
        	style: 'simple'
    	}, {
    		name: 'Статистика',
        	go: 'schedule',
        	style: 'simple'
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

	  this.getUserLeftMenu = function(){
		  return userLeftMenu;
	  };
	  
	  this.getUserRightMenu = function(){
		  return userRightMenu;
	  };
	  
	  this.getAnonymousLeftMenu = function(){
		  return anonymousLeftMenu;
	  };
	  
	  this.getAnonymousRightMenu = function(){
		  return anonymousRightMenu;
	  };
	  
	  this.setUserLeftMenu = function(userMenu){
		  userLeftMenu = userMenu;
		  return;
	  };
	  
	  this.setAnonymousLeftMenu = function(anonymousMenu){
		  anonymousLeftMenu = anonymousMenu;
		  return;
	  };
}]);
