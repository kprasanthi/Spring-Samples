<!doctype html>
<html ng-app>
	<head>
		<title>Spring MVC + AngularJS Demo</title>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
    	<script>
    	function getEmpInfo($scope, $http) {
    	    $http.get('http://localhost:8080/SpringMVC/ded/getDEDByAttId/123').
    	        success(function(data) {
    	            $scope.dedBean = data;
    	        });
    	}
    	</script>
	</head>
	<body>
	<!-- <table id="players">
        <tr >
            
            <td><button ng-click="getEmpInfo()">submit</button></td>
        </tr>
    </table> -->
		<div ng-controller="getEmpInfo">
			<h2>Employee Information</h2>
			<p>Creation Date : {{dedBean.creationDate}}</p>
			
    
			<p>attID : {{dedBean.hierarchyObjList[0].attID}}</p>
			<p>firstName : {{dedBean.hierarchyObjList[0].firstName}}</p>
			<p>lastName : {{dedBean.hierarchyObjList[0].lastName}}</p>
			<p>email : {{dedBean.hierarchyObjList[0].email}}</p>
			<p>phone : {{dedBean.hierarchyObjList[0].phone}}</p>
			<p>qPresence : {{dedBean.hierarchyObjList[0].qPresence}}</p>
			
			
		</div>
	</body>
</html>