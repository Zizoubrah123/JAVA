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

<title>edit</title>
</head>
<body>
    <div class="container">
   <h1>Edit course </h1>
   <hr />
   
   <form:form action="/class/${thisClass.id }/edit" method="post" modelAttribute="thisClass">
   <input type="hidden" name="_method" value="put">
   
			<form:errors class="text-danger" path="*" />

			<p>
				<form:label path="name">name</form:label>
				<form:input path="name" />
			</p>
			<p>
				<form:label path="weekDay">week Day</form:label>
				<form:input path="weekDay" />
			</p>
									<p>
				<form:label path="time">time</form:label>
				<form:input type="time" path="time" />
			</p>
			<p>
				<form:label path="price">price</form:label>
				<form:input path="price" type="number" />
			</p>
						<p>
				<form:label path="description">description</form:label>
				<form:textarea path="description" />
			</p>
	
			<form:button class="btn btn-primary">UPDATE</form:button>
			<a href="/classes" class="btn btn-danger">cancel</a><br />

</form:form> 
   	<form  action="/class/${thisClass.id}/delete" method="post">
   	<input type="hidden" value="${id }" />
   	<input type="hidden" name="_method" value="delete">
    <input class="btn btn-danger" type="submit" value="Delete">
   	</form>   
   
   </div>
</body>
</html>