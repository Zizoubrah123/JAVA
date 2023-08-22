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
   <h1>Edit Book 📖</h1>
   <hr />
   
   <form:form action="/books/${book.id }/edit" method="post" modelAttribute="book">
   <input type="hidden" name="_method" value="put">
   
    <p>
        <form:label path="title">Title</form:label>
        <form:errors class="text-danger" path="title"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="author">Author</form:label>
        <form:errors class="text-danger" path="author"/>
        <form:input path="author"/>
    </p>

    <p>
        <form:label path="thoughts">thoughts</form:label>
        <form:errors class="text-danger" path="thoughts"/>
        <form:textarea  path="thoughts"/>
    </p>    
    <button>UPDATE</button>
</form:form>    
   
   </div>
</body>
</html>