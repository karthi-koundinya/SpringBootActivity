<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h1>Welcome to Registration Page</h1>
<form action="insertuser" method="post">
Email: <input type="email" name="email"><br><br>
Name: <input type="text" name="uname"><br><br>
Mobile: <input type="text" name="mobile"><br><br>
Location: <input type="text" name="location"><br><br>
<input type="reset" value="Clear">
<input type="submit" value="Register"> &nbsp &nbsp <a href="index"><input type="button" value="Back"></a>
</form>
</body>
</html>