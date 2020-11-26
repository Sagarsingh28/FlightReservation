<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Flight Booking Confirmed</h1>
<hr>
<h2>Passenger Name: ${info2.passengerFirstName} ${info2.passengerLastName}</h2>
<h3>Time Stamp: ${info.created}</h3>
<h3>Checked In: ${info.checkedIn}</h3>
<h3>Passenger Email Id: ${info2.passengerEmailId}</h3>
<h3>Passenger Phone Number: ${info2.passengerPhoneNo}</h3>
<h3>Card Holder: ${info2.cardName}</h3>
<br><br>

<button onclick="window.location.href='homePage'">Go to Home Page</button>
</body>
</html>