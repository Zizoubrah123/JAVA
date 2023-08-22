<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	<h1>New expense</h1>
	<form:form action="/ninja/new" method="post" modelAttribute="ninja">
		<h4>
			<form:label path="firstName">first Name</form:label>
			<form:errors path="firstName" />
			<form:input path="firstName" />
		</h4>
		<h4>
			<form:label path="lastName">Last Name</form:label>
			<form:errors path="lastName" />
			<form:input path="lastName" />
		</h4>

		<h4>
			<form:label path="age">age</form:label>
			<form:errors path="age" />
			<form:input type="number" path="age" />
		</h4>
		
		    <form:select path="dojo">
        <c:forEach var="oneDojo" items="${listDojos}">
            <!--- Each option VALUE is the id of the person --->
            <form:option value="${oneDojo.id}" path="person">
            <!--- This is what shows to the user as the option --->
                <c:out value="${oneDojo.name}"/>
            </form:option>
        </c:forEach>
    </form:select>
		<input type="submit" value="Submit" />
	</form:form>
</div>

</body>
</html>