<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

<title>login</title>
</head>
<body>
<div class="container" style="display:flex;justify-content:space-between">

		<!-- REGISTER A NEW USER  -->
		<!-- bring in the newUser empty Object -->
		<div class="btn btn-dark" style="width: 50%; heigth:50%">
			<h3>Register:</h3>
			<form:form action="/register" 
			method="post" modelAttribute="newUser" class="btn " style="width:80%">
				<div  >
					<label>User Name:</label>
					<form:input path="userName" class="form-control" />
					<form:errors path="userName" class="text-danger" />
				</div>
				<div class="form-group">
					<label>Email:</label>
					<form:input path="email" class="form-control" />
					<form:errors path="email" class="text-danger" />
				</div>
				<div class="form-group">
					<label>Password:</label>
					<form:password path="password" class="form-control" />
					<form:errors path="password" class="text-danger" />
				</div>
				<div class="form-group">
					<label>Confirm Password:</label>
					<form:password path="confirm" class="form-control" />
					<form:errors path="confirm" class="text-danger" />
				</div>
				<input type="submit" value="Register" class="btn btn-primary" />
			</form:form>
		</div>
		<!-- LOGIN -->
		<!-- newLogin object will touch the model to validate only -->
		<div class="btn btn-dark" style="width: 40%">
			<h3>Login:</h3>
			<form:form action="/login" method="post" 
			modelAttribute="newLogin">
				<div class="form-group">
					<label>Email:</label>
					<form:input path="email" class="form-control" />
					<form:errors path="email" class="text-danger" />
				</div>
				<div class="form-group">
					<label>Password:</label>
					<form:password path="password" class="form-control" />
					<form:errors path="password" class="text-danger" />
				</div>
				<input type="submit" value="Login" class="btn btn-success" />
			</form:form>
		</div>
	</div>
</body>
</html>