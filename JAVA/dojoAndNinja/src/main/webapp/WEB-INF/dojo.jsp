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
<title>Insert title here</title>
</head>
<body>
	<form:form action="/dojo/new" method="post" modelAttribute="dojo">
		<h4>
			<form:label path="name">dojo name :</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</h4>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>