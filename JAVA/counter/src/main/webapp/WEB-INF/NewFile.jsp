<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>current visit count</title>
</head>
<body>
<h2>you have visited <a href="#">http://your_server</a><c:out value="${count}"/> times</h2>
<a href="/your_server">Test another visit ?</a>
</body>
</html>