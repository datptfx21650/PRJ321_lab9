<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>CRM - Customer Relationship Manager</h2>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
		</tr>
		<c:forEach var="customer" items="${customers}">
			<tr>
				<td>${customer.firstName}</td>
				<td>${customer.lastName}</td>
				<td>${customer.email}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>