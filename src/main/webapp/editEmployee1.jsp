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
<form method="post" action="UpdateEmployeeinfo">
	<table  cellpadding="0" cellspacing="0" width="50%"">
<%EmployeeInfo emp= (EmployeeInfo) request.getSession().getAttribute("emp");%>

<!-- 		pStmt.setString(5, ); -->
<!-- 		pStmt.setString(6, ); -->
<!-- 		pStmt.setString(7, ); -->
<!-- 		pStmt.setString(8, ); -->
<!-- 		pStmt.setString(9, ); -->
<!-- 		pStmt.setString(10, ); -->
<!-- 		pStmt.setString(11, ); -->
<!-- 		pStmt.setString(12, ); -->
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
					<td><input type="radio" id=emp name="gender" value="<%=emp.getGender() %>">
						<label for="male">Male</label>
						 <input type="radio" id="Female" name="gender" value="female">
						 <label for="female">Female</label>
					</td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" value="<%=emp.getAddress() %>"/></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" value="<%=emp.getCity() %>"/></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" name="state" value="<%=emp.getState() %>"/></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><select name="country" id="country" value="<%=emp.getCountry() %>">
						    <option value="USA">USA</option>
						    <option value="INDIA">INDIA</option>
						    <option value="SG">SG</option>
						    <option value="AUS">AUS</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><label for="phone"><%=emp.getPhone() %></label></td>
<%-- 					<td><input type="text" name="phone" value="<%=emp.getPhone() %>"/></td> --%>
				</tr>
				<tr>
					<td>Bank</td>
					<td><select name ="bank" id="bank" value="<%=emp.getBank() %>">
							<option value = "citi"> Citi </option>
							<option value = "barclays"> Barclays </option>
					</select>
					</td>
				</tr>
				<tr>
					<td>Account#</td>
					<td><input type="text" name="account" value="<%=emp.getAccount() %>"/></td>
				</tr>
				<tr>
					<td>SSN</td>
					<td><input type="text" name="ssn" value="<%=emp.getSsn() %>"/></td>
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