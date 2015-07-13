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
	  

	  this.getUserLeftMenu = function(){
		  return userLeftMenu;
	  };
	  
	  
	  this.getAnonymousLeftMenu = function(){
		  return anonymousLeftMenu;
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
