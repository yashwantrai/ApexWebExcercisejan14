<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="left">
		<h1>Update Phone Form</h1>
<%@include file="formError.jsp" %>
		<form action="UpdatePhoneServlet" method="get">
			<table style="with: 80%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastname" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" /></td>
				</tr>
				<tr>
					<td>Old Phone Num</td>
					<td><input type="text" name="oldPhoneNum" /></td>
				</tr>
				<tr>
					<td>New Phone Num</td>
					<td><input type="text" name="newPhonenum" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
		</form>
</div>
</body>
</html>
