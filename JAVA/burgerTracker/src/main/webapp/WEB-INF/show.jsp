<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Book Information :</h1>
<table class="table">
			<thead>
				<tr>
					<th>Burger Name</th>
					<th>Restaurant name</th>
					<th>Rating</th>
				</tr>

			</thead>
			<tbody>
				<c:forEach items="${allExpense}" var="OneExpense">
					<tr>
						<td><a href="/expense/${OneExpense.id}"><c:out value="${OneExpense.name}" /></a></td>
						<td><c:out value="${OneExpense.vendor}" /></td>
						<td><c:out value="${OneExpense.amount}" /></td>
						<td><c:out value="${OneExpense.id}" /></td>
						<td><a href="/expense/${OneExpense.id}/edit">Edit</a>
							<form action="/expense/delete/${OneExpense.id}" method="post">
								<input type="hidden" name="_method" value="delete"> 
								<input type="submit" value="Delete" class="btn btn-danger">
							</form></td>
					</tr>
				</c:forEach>
			</tbody>



		</table>

</body>
</html>