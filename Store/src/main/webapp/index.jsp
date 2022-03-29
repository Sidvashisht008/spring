<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SuperMarket</title>
</head>
<body style="background-color:#EAEAEA;">
	<form action="addCustomer">
		<label>Customer Id <input type="number" name ="cid"></label><br>
		<label>Name <input type="text" name ="cname"></label><br>
		<label>Phone number <input type="number" name ="cphone"></label><br>
		<label>Email id <input type="text" name ="cmail"></label><br>
		<label>State <input type="text" name ="cstate"></label><br>
		<input type="submit">
	</form>
	<form action="getCustomer">
		<label>Customer Id <input type="number" name ="cid"></label><br>
		<input type="submit">
	</form>
	<h1>Spring Boot - File Upload</h1>
	<form method="POST" action="/upload" enctype="multipart/form-data">
		<input type="file" name="file" /><br />
		<br /> <input type="submit" value="Submit" />
	</form>
</body>
</html>