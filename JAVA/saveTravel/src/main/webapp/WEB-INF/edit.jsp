<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit</title>
</head>
<body>
<h1>Edit exprese</h1>
<a href="/" class="ml-auto p-2">Go back</a>
<form:form action="/travel/${SaveTravel.id}" method="post" modelAttribute="SaveTravel">
    <input type="hidden" name="_method" value="put">
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
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>