<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
	<head>	
		<title>Employee Registration Form</title>
	</head>
	<body>
		<form action="/redis-service/add" method="post">
			<table>
				<tr><td>Employee Name   </td><td><input type="text" name="name"></td></tr>
				<tr><td>Emp Designation  </td><td><input type="text" name="designation"></td></tr>
				<tr><td>Employee Salary  </td><td><input type="text" name="salary"></td></tr>
			</table>
			<p><input type="submit" value="Submit Form"></p>
		</form>
	</body>
</html>