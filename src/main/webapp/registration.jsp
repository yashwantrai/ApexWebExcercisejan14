<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form<</title>
</head>
<body>
<div align="left">
		<h1>Registration Form</h1>
<%@include file="formError.jsp" %>
		<form action="RegistrationServlet" method="get">
		<input type="submit" value="Find Employee info" />
		<form action="RegistrationServlet" method="get">
		<input type="submit" value="Edit Employee info" />
		</form>
		<form action="RegistrationServlet" method="post">
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
					<td>Middle Name</td>
					<td><input type="text" name="middlename" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input type="radio" id="male" name="gender" value="male">
						<label for="male">Male</label> <input type="radio" id="Female"
						name="gender" value="female"> <label for="female">Female</label>
					</td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
		</form>
</div>
</body>
</html>