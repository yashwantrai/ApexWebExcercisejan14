<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<div align="left">
		<h1>Contact Information</h1>
		<%@include file="formError.jsp" %>
		<form action="ContactInfoServlet" method="post">
			<table style="with: 80%">
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" /></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" name="state" /></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><select name="country" id="country">
						    <option value="USA">USA</option>
						    <option value="INDIA">INDIA</option>
						    <option value="SG">SG</option>
						    <option value="AUS">AUS</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
		</form>
		</div>
</body>
</body>
</html>