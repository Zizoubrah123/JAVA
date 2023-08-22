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
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<title>show</title>
</head>
<body>
<a href="/welcome">home</a><br/>

<h2> title: </h2><c:out value="${oneBook.title}" /></h2>
<h2>author: <c:out value="${oneBook.author}" /></h2>
<h2> thoughts: <c:out value="${oneBook.thoughts}" /></h2>
<h2> created at:<c:out value="${Onebook.createdAt}" /></h2>
<a href="/books/${oneBook.id}/edit">edit</a>
   	<form action="/books/${oneBook.id }" method="post">
   	<input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
   	</form>
</body>
</html>