<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="emp" class="com.apex.pojo.EmployeeInfo" scope="session"> </jsp:useBean>

First Name: <jsp:getProperty name="emp" property="firstName"/> <br>

<h1>You have registered successfully </h1>
<style>
table {
  border-collapse: collapse;
  width: 70%;
}
td, th {
  border: 1px solid #dddddd;
  text-align: Left;
  padding: 8px;
}
tr:nth-child(even) {
  background-color: #dddddd;
}
</style>

<table>

<%if (emp.getFirstName()!= null){%>
	<tr><td>First Name </td><td>=>&nbsp&nbsp</td><td> <jsp:getProperty name="emp" property="firstName"/></td></tr>
	<br>
<%}%>
<%if (emp.getMiddlename()!= null){%>
	<tr><td>Middle Name </td><td>=>&nbsp&nbsp</td><td> <jsp:getProperty name="emp" property="middlename"/></td></tr>
	<br>
<%}%>
<%if (emp.getLastname()!= null){%>
	<tr><td>Last Name </td><td>=>&nbsp&nbsp</td><td> <jsp:getProperty name="emp" property="lastname"/></td></tr>
	<br>
<%}%>
<%if (emp.getGender()!= null){%>
	<tr><td>Gender</td><td>=>&nbsp&nbsp</td><td> <jsp:getProperty name="emp" property="gender"/></td></tr>
	<br>
<%}%>
<%if (emp.getAddress()!= null){%>
	<tr><td>Address</td><td>=>&nbsp&nbsp</td><td> <jsp:getProperty name="emp" property="address"/></td></tr>
	<br>
<%}%>
<%if (emp.getCity()!= null){%>
	<tr><td>City</td><td>=>&nbsp&nbsp</td><td> <jsp:getProperty name="emp" property="city"/></td></tr>
	<br>
<%}%>
<%if (emp.getState()!= null){%>
	<tr><td>State</td><td>=>&nbsp&nbsp</td><td> <jsp:getProperty name="emp" property="state"/></td></tr>
	<br>
<%}%>
<%if (emp.getCountry()!= null){%>
	<tr><td>Country</td><td>=>&nbsp&nbsp</td><td> <jsp:getProperty name="emp" property="country"/></td></tr>
	<br>
<%}%>
<%if (emp.getPhone()!= null){%>
	<tr><td>Phone</td><td>=>&nbsp&nbsp</td><td> <jsp:getProperty name="emp" property="phone"/></td></tr>
	<br>
<%}%>
<%if (emp.getBank()!= null){%>
	<tr><td>Bank</td><td>=>&nbsp&nbsp</td><td> <jsp:getProperty name="emp" property="bank"/></td></tr>
	<br>
<%}%>
<%if (emp.getAccount()!= null){%>
	<tr><td>Account</td><td>=>&nbsp&nbsp</td><td> <jsp:getProperty name="emp" property="account"/></td></tr>
	<br>
<%}%>
<%if (emp.getSsn()!= null){%>
	<tr><td>SSN</td><td>=>&nbsp&nbsp</td><td> <jsp:getProperty name="emp" property="ssn"/></td></tr>
	<br>
<%}%>


</table>

</body>
</html>