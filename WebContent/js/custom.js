var app = angular.module('myApp', []);

app.controller('myCtrl', function($scope, $http) {

	var point = {
		"id" : 1,
		"x" : 15,
		"y" : 68,
		"z" : 44
	};
	
	$scope.getPoint = function() {

		$http.get('index/getp.htm').success(function(res) {
			point = res;
			console.log(point);
		});
	};
	$scope.postPoint = function() {
		
		console.log(JSON.stringify(point));
		
		$http.post('index/posts.htm', JSON.stringify(point), {
			async : true,
			contentType : 'application/json',
			dataType : 'json'
		});
	};
	$scope.postPoint1 = function() {
		
		console.log(JSON.stringify(point2));
		
		$http.post('index/posts.htm', JSON.stringify(point2), {
			async : true,
			contentType : 'application/json',
			dataType : 'json'
		});
	};
	$scope.postPoint2 = function() {
		$http.post('index/posts.htm', "lol", {
			async : true,
			contentType : 'application/json',
			dataType : 'json'
		});
	};
});