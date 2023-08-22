<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="style.css">

<title>fruity loops</title>
</head>
<body>
<h1 class="hahah">Fruits Store</h1>
<div class="diva">

<table>
<thead>
  <tr>
    <th>name</th>
    <th>price</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${fruities}" var="oneFruit" >
  <tr>
    <td>${oneFruit.name}</td>
    <td>${oneFruit.price}</td>
  </tr>
  </c:forEach>
  </tbody>
</table>
</div>














</body>
</html>