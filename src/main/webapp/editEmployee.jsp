<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.apex.pojo.EmployeeInfo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="">
	<table  cellpadding="0" cellspacing="0" width="50%"">
<%EmployeeInfo emp = (EmployeeInfo) request.getAttribute("emp");%>

<!-- 		pStmt.setString(5, emp.getAddress()); -->
<!-- 		pStmt.setString(6, emp.getCity()); -->
<!-- 		pStmt.setString(7, emp.getState()); -->
<!-- 		pStmt.setString(8, emp.getCountry()); -->
<!-- 		pStmt.setString(9, emp.getPhone()); -->
<!-- 		pStmt.setString(10, emp.getBank()); -->
<!-- 		pStmt.setString(11, emp.getAccount()); -->
<!-- 		pStmt.setString(12, emp.getSsn()); -->
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" value="<%=emp.getFirstName() %>" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastname" value="<%=emp.getLastname() %>" /></td>
				</tr>
				<tr>
					<td>Middle Name</td>
					<td><input type="text" name="middlename" value="<%=emp.getMiddlename() %>" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input type="radio" id="male" name="gender" value="<%=emp.getGender() %>">
						<label for="male">Male</label> <input type="radio" id="Female"
						name="gender" value="female"> <label for="female">Female</label>
					</td>
				</tr>
				<tr>
					<td><input type="submit" name="update" value="Update"/></td>
					<td width="201"><input type="reset" name="clear" value="Clear" />&nbsp;</td>
				</tr>
			</table>
			</td>
		</tr>
	</table>
</form>
</body>
</html>
