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
<title>create</title>
</head>
<body>
	<div class="container">
		<h1>Create Book 📖</h1>
		<hr />
<a href="/welcome">home</a><br/>
		<form:form action="/books" method="post" modelAttribute="book">
			<form:errors class="text-danger" path="*" />

			<p>
				<form:label path="title">Title</form:label>
				<form:input path="title" />
			</p>
			<p>
				<form:label path="author">Author</form:label>
				<form:textarea path="author" />
			</p>

			<p>
				<form:label path="thoughts">thoughs</form:label>
				<form:input  path="thoughts" />
			</p>
			<form:input path="postedBy" type="hidden"/>
			<form:button>create</form:button>
		</form:form>
	</div>
</body>
</html>