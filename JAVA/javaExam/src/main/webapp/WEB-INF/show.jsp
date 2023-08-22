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
<div style="margin:30px;">
<a href="/classes" class="btn btn-primary">home</a><br/>
<h1>${oneClass.name} with ${oneClass.instructor }</h1>
<h2> Day: <c:out value="${oneClass.weekDay}" /></h2>
<h2> time: <c:out value="${oneClass.time}" /></h2>
<h2>Cost: <c:out value="${oneClass.price}" /></h2>
<c:out value="${oneClass.description}" />


   </div>
</body>
</html>