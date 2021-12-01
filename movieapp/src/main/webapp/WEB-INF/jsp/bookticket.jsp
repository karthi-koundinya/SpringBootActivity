<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function today() {
    let d = new Date();
    let currDate = d.getDate();
    let currMonth = d.getMonth()+1;
    let currYear = d.getFullYear();
    return currYear + "-" + ((currMonth<10) ? '0'+currMonth : currMonth )+ "-" + ((currDate<10) ? '0'+currDate : currDate );
}
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Movie booking ticket</h1>
<form action="bookingticket" method="post">
Movie Name: <input type="text" name="mname"><br><br>
Circle Type: <select name="ctype">
<option value="Economy">Economy</option>
<option value="Platinum">Platinum</option>
</select><br><br>
Date Of Booking: <input type="date" name="dateofbooking"><br><br>
Show Date: <input type="date" name="showdate" placeholder="yyyy-mm-dd"><br><br>
Show Time: <input type="time" name="showtime"><br><br>
No of Tickets: <input type="number" name="noofticket"><br><br>
<input type="submit" value="Book Ticket">
<input type="reset" value="Clear"> &nbsp &nbsp <a href="index"><input type="button" value="Back"></a>
</form>
</body>
</html>