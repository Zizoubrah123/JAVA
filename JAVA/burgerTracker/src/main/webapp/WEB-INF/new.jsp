<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<title>create</title>
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th>Burger Name</th>
				<th>Restaurant name</th>
				<th>Rating</th>
			</tr>

		</thead>
		<tbody>
			<c:forEach items="${burgerList}" var="oneBurger">
				<tr>
					<td><c:out value="${oneBurger.burgerName}" /></td>
					<td><c:out value="${oneBurger.restoName}" /></td>
					<td><c:out value="${oneBurger.rating}" /></td>
					<td><a href="/burger/${oneBurger.id}/edit">Edit</a></td>
					<td>
						<form action="/burger/${oneBurger.id}" method="post">
							<input type="hidden" name="_method" value="delete"> <input
								type="submit" value="Delete">
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<h1>New Book</h1>
	<form:form action="/burgers" method="post" modelAttribute="burger">
		<p>
			<form:label path="burgerName">burger Name</form:label>
			<form:errors path="burgerName" />
			<form:input path="burgerName" />
		</p>
		<p>
			<form:label path="restoName">resto name</form:label>
			<form:errors path="restoName" />
			<form:input path="restoName" />
		</p>
		<p>
			<form:label path="rating">rating</form:label>
			<form:errors path="rating" />
			<form:input type="number" path="rating" />
		</p>
		<p>
			<form:label path="note">Pages</form:label>
			<form:errors path="note" />
			<form:textarea path="note" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>


</body>
</html>