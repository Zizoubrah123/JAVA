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
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

<title>create</title>
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th>expense</th>
				<th>vendor</th>
				<th>amount</th>
			</tr>

		</thead>
		<tbody>
			<c:forEach items="${allTravel}" var="oneTravel">
				<tr>
					<td><a href="/travel/${oneTravel.id}/show"><c:out value="${oneTravel.name}" /></a></td>
					<td><c:out value="${oneTravel.vendor}" /></td>
					<td><c:out value="${oneTravel.amount}" /></td>
					<td><a href="/travel/${oneTravel.id}/edit">Edit</a></td>
					<td>
						<form action="/travel/${oneTravel.id}" method="post">
							<input type="hidden" name="_method" value="delete"> <input
								type="submit" value="Delete">
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<h1>New expense</h1>
	<form:form action="/travel/new" method="post" modelAttribute="saveTravel">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<p>
			<form:label path="vendor">vendor</form:label>
			<form:errors path="vendor" />
			<form:input path="vendor" />
		</p>
		<p>
			<form:label path="amount">amount</form:label>
			<form:errors path="amount" />
			<form:input type="number" path="amount" />
		</p>
		<p>
			<form:label path="note">description</form:label>
			<form:errors path="note" />
			<form:textarea path="note" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>


</body>
</html>