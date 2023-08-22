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

<title>home</title>
</head>
<body>
	<h1>
		hello
		<c:out value="${userName }"></c:out>
	</h1>
	<h2>Books from everyone's sh</h2>
	<a href="/logout">logout</a><br/>
		<a href="/books/new">create new book</a>
	

	<table class="table" style="width:60%; margin : auto; border: 2px 2px black;">
		<thead>
			<tr>
				<th scope="col">id</th>
				<th scope="col">title</th>
				<th scope="col">author</th>
				<th scope="col">released date</th>
				<th scope="col">posted by</th>
			</tr>
		</thead>
		<tbody>
   <c:forEach items="${booksList }" var="oneBook" >
   <tr>
      <td>${oneBook.id}</td>
   <td><a href="/book/${oneBook.id}">${oneBook.title}</td>
   <td>${oneBook.author}</td>
   <td>${oneBook.createdAt}</td>
   <td>${oneBook.postedBy}</td>

   </tr>
   </c:forEach>
		</tbody>
	</table>

</body>
</html>