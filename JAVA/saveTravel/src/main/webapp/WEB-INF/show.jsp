<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="d-flex">
		<h1 style="color: blue" class="p-2">Expense Details</h1>
		<a href="/" class="ml-auto p-2">Go back</a>
	</div>
	<div style="display: flex ">
		<div>
			<p>Expense Name : </p>	
			<p>Expense Description : </p>
			<p>Vendor : </p>
			<p>Amount Spent : </p>
		</div>
		
		<div >
			<p> ${oneexpense.name}</p>	
			<p> ${oneexpense.note}</p>
			<p> ${oneexpense.vendor}</p>
			<p> ${oneexpense.amount}</p>
		</div>
	</div>
</div>

</body>
</html>