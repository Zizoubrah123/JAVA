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
<h1>Edit Book</h1>
<form:form action="/burger/${burger.id}" method="post" modelAttribute="burger">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="burgerName">burger Name</form:label>
        <form:errors path="burgerName"/>
        <form:input path="burgerName"/>
    </p>
    <p>
        <form:label path="restoName"> resto name</form:label>
        <form:errors path="restoName"/>
        <form:textarea path="restoName"/>
    </p>
    <p>
        <form:label path="rating">rating</form:label>
        <form:errors path="rating"/>
        <form:input type="number" path="rating"/>
    </p>
    <p>
        <form:label path="note">note</form:label>
        <form:errors path="note"/>     
        <form:input  path="note"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>