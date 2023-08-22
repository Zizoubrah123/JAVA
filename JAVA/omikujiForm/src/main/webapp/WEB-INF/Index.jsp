<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Send an omikuji</h2>
<form action="/login" method="POST">
	<label>Pick any number from 5 to 25:</label>
		<input type="number" name="number"/><br/>
		
	<label>Enter the name of any city:</label>
	<input type="text" name="city" /><br/>
	
		<label>Enter the name of any real person:</label>
	<input type="text" name="person" /><br/>
	
		<label>Enter professional endeavor or hobby:</label>
	<input type="text" name="hobby" /><br/>
	
		<label>Enter any type of living thing:</label>
	<input type="text" name="livingThing" /><br/>

		<label>Say something nice to someone:</label>
	<textarea rows="4" cols="50" name="someone"></textarea><br/>
	<button>Send</button>
	
</form>
</body>
</html>