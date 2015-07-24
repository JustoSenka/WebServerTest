<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Hello World</title>

<!-- jQuery -->
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<!-- Bootstrap -->
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<!-- Angular -->
<script
	src="//cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.14/angular.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.14/angular-sanitize.js"></script>

<!-- Custom -->

<script type="text/javascript" src="js/custom.js"></script>

</head>
<body ng-app="myApp" ng-controller="myCtrl">

	<div class="container">
		<h2>${message}</h2> 
		<br>
		<h2>${name}</h2>

		<div>
			<button class="btn btn-primary" ng-click="getPoint()">Get Point</button>
			<button class="btn btn-primary" ng-click="postPoint()">Post Point</button>
			<button class="btn btn-primary" ng-click="postPoint1()">Post Point</button>
			<button class="btn btn-primary" ng-click="postPoint2()">Post Point</button>
		</div>
		
	</div>

</body>
</html>