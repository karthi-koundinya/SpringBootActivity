<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Movie Add Form</h1>
<form action="insertmovie" method="post">
Movie Id: <input type="number" name="mid"><br><br>
Movie Name: <input type="text" name="mname"><br><br>
Director Name: <input type="text" name="dname"><br><br>
Language: <select name="language">
<option value="Kannada">Kannada</option>
<option value="Hindi">Hindi</option>
<option value="Telugu">Telugu</option>
<option value="Tamil">Tamil</option>
<option value="English">English</option>
<option value="Others">Other</option>
</select><br><br>
Hero Name: <input type="text" name="hname"><br><br>
Heroin Name: <input type="text" name="hinname"><br><br>
Release Date: <input type="date" name="rdate" placeholder="yy-mm-dd"><br><br>
<input type="reset" value="Clear">
<input type="submit" value="Add Movie"> &nbsp &nbsp <a href="index"><input type="button" value="Back"></a>

</form>
</body>
</html>