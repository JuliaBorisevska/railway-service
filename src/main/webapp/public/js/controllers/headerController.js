'use strict';
app
  .controller('HeaderCtrl', ['$scope', '$state', 'User', 'Menu', function ($scope, $state, User, Menu) {
      var user = User.getUserData();
      var i, lth;
  
      function onSuccessfulLogout() {
      	$state.reload('home');
      }
      
      function onFailedLogout(error) {
         
      }
      
      $scope.logout = function() {
          User.logout(onSuccessfulLogout, onFailedLogout);
      };
      
      
      $scope.changeClass = function (e) {
    	  for(var i = 0, lth = $scope.leftMenu.length; i < lth; i++) {
    		  $scope.leftMenu[i].style='simple';
              if ($scope.leftMenu[i].name==e.target.attributes.data.value){
            	  $scope.leftMenu[i].style='active';
              }
          }
    	  /*if ($scope.brand.name==e.target.attributes.data.value){
        	  $scope.brand.style='active';
          }else {
        	  $scope.brand.style='simple';
          }*/
    	  if (user.isAuthenticated){
    		  Menu.setUserLeftMenu($scope.leftMenu);
    	  }else{
    		  Menu.setAnonymousLeftMenu($scope.leftMenu);
    	  }
      }
      //alert(JSON.stringify(user));
      if (user.isAuthenticated){
    	  $scope.leftMenu = Menu.getUserLeftMenu();
    	  //$scope.rightMenu = Menu.getUserRightMenu();
    	  
      }else{
    	  $scope.leftMenu = Menu.getAnonymousLeftMenu();
    	  //$scope.rightMenu = Menu.getAnonymousRightMenu();
      }
    $scope.isAuthenticated = user.isAuthenticated; 
  }]);