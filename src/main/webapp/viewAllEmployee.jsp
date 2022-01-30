<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList" %>
<%@page import="com.apex.pojo.EmployeeInfo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Middle Name</th>
				<th>Gender</th>
				<th>Address</th>
				<th>City</th>
				<th>State</th>
				<th>Country</th>
				<th>Phone</th>
				<th>Bank</th>
				<th>Account</th>
				<th>SSN</th>
			</tr>
		</thead>
		<tbody>
		<% 
			int i=1;
			ArrayList<EmployeeInfo> emplist = (ArrayList) request.getAttribute("emplist");
		%>
		<c:forEach items="${emplist}" var="u">
			<tr>
				<td>${u.firstName} </td>
				<td>${u.lastname}</td>
				<td>${u.middlename}</td>
				<td>${u.gender}</td>
				<td>${u.address}</td>
				<td>${u.city}</td>
				<td>${u.state}</td>
				<td>${u.country}</td>
				<td>${u.phone}</td>
				<td>${u.bank}</td>
				<td>${u.account}</td>
				<td>${u.ssn}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>