<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

<title>home</title>
</head>
<body>
	<h1>
		hello
		<c:out value="${userName}"></c:out>
	</h1>
	<h2>course schedule</h2>
	<a href="/logout" class="btn btn-danger" style="margin-left: 94%">logout</a>
	<br />


	<table class="table" style="width: 60%; margin: auto">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Class Name</th>
				<th scope="col">Instructor</th>
				<th scope="col">WeekDay</th>
				<th scope="col">Price</th>
				<th scope="col">time</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allclasses }" var="oneClass">
				<tr>

					<td><a href="/class/${oneClass.id}">${oneClass.name}</a> 
					
					<c:if test="${user_id eq oneClass.user.getId() }">
							<a href="/class/${oneClass.id}/edit" class="btn btn-primary">edit</a>
	
							</c:if></td>
					<td>${oneClass.instructor}</td>
					<td>${oneClass.weekDay}</td>
					<td>$${oneClass.price}</td>
					<td>${oneClass.time}</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/classes/new" class="btn btn-primary">New course</a>
</body>
</html>