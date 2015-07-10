'use strict';

app
  .service('User', ['$http', function User($http) {
    var userData = {
      isAuthenticated: false,
      firstName: '',
      lastName: '',
      role: ''
    };

    this.getUserData = function(){
      return userData;
    };
    this.authenticate = function(username, password, successCallback, errorCallback) {
    	var config = {
    			method: 'POST',
    			url: '/ticketservice/login',
				data: 'username=' + username + '&password=' + password,
				headers: {
                    "Content-Type": "application/x-www-form-urlencoded",
                    "X-Login-Ajax-call": 'true'
                }
    	};
    	$http(config)
    		.success(function(data) {
    			//alert(JSON.stringify(data));/////////////////
    			userData.isAuthenticated = true;
    			userData.firstName = data.firstName;
    			userData.lastName = data.lastName;
    			//userData.role = data.role.title;
    			if (typeof successCallback === 'function') {
    				successCallback();
    			}
    		})
    		.error(function(data) {
    			if (typeof errorCallback === 'function') {
    				if (data) {
    					errorCallback(data.description);
    				} else {
    					errorCallback('Unable to contact server. Please, try again later.');
    				}
    			}
    		});
    	//userData.isAuthenticated = true;
		//userData.firstName = "Alex";
		//userData.lastName = "Volkov";
		//userData.role = "customer";
    	};
}]);


  