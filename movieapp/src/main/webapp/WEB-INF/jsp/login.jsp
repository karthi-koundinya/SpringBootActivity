<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1>Login Page</h1>	
<form action="login" method="post"><br> 
<label for="usrname">Username:</label>
<input type="text" id="email" name="email" placeholder="Enter your username" required >
          <br><br>
<label for="psw">Password:</label>
<input type="password" placeholder="Enter your password" id="psw" name="psw" required>
          <br><br>
<input type="reset" value="Clear">
<input type="submit" value="Submit"> &nbsp &nbsp <a href="index"><input type="button" value="Back"></a>
</form>




	
</body>
</html>