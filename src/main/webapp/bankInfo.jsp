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
		<h1>Bank Information</h1>
		<%@include file="formError.jsp" %>
		<form action="BankInfoServlet" method="post">
			<table style="with: 80%">
				<tr>
					<td>Bank</td>
					<td><select name ="bank" id="bank">
							<option value = "citi"> Citi </option>
							<option value = "barclays"> Barclays </option>
					</select>
<br>
					</td>
				</tr>
				<tr>
					<td>Account#</td>
					<td><input type="text" name="account" /></td>
				</tr>
				<tr>
					<td>SSN</td>
					<td><input type="text" name="ssn" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
		</form>
		</div>
</body>
</html>