<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
.alert i[class^="bi-"]{
  font-size: 1.5em;
  line-height: 1;
}
</style>


<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	

	<div class="container col-md-8 col-md-offset-3" style="overflow: auto">
	<c:if test="${param.error!=null }">
	<div class="alert alert-danger alert-dismissible d-flex align-items-center fade show">
      	<i class="bi-exclamation-octagon-fill"></i>
        <strong class="mx-2">Error!</strong> Invalid Username and password!!!
        <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
    </div>
		</c:if>
		<h1>Login Form</h1>
		<form action="<%=request.getContextPath()%>/login" method="post">

			<div class="form-group">
				<label for="uname">User Name:</label> <input type="text"
					class="form-control" id="username" placeholder="User Name"
					name="username" required>
			</div>

			<div class="form-group">
				<label for="uname">Password:</label> <input type="password"
					class="form-control" id="password" placeholder="Password"
					name="password" required>
			</div>


			<button type="submit"  class="btn btn-primary">Submit</button>
		
		<a href="/res"> <input type="button"  class="btn btn-primary"  value="Register" >  </a>
  			 


		</form>
	</div>
</body>
</html>