<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Flight</title>
</head>
<body>
<h2>Flight Information</h2>
<hr>
<h3>Airlines : ${flight.operatingAirlines}</h3>
<h3>From : ${flight.departureCity}</h3>
<h3>To : ${flight.arrivalCity}</h3>
<h3>Date : ${flight.dateOfDeparture}</h3>
<h3>Time : ${flight.estimatedDepartureTime}</h3>
<br><br>
<h2>Personal Information</h2>
<hr>
<form:form action="passengerReservation" method="POST">
<pre>
	First Name: <input type="text" name="passengerFirstName" value="${thisUser.firstName}"/>
	Last Name: <input type="text" name="passengerLastName"/>
	Email ID: <input type="text" name="passengerEmailId"/>
	Phone Number: <input type="text" name="passengerPhoneNo"/>
</pre>
<br><br>
<h2>Payment</h2>
<pre>
	<input type="hidden" name="flightId" value="${flight.id}">
	Name on Card: <input type="text" name="cardName">
	Card Number: <input type="text" name="cardNumber">
	Expire: <input type="text" name="cardexpire">
	CVV: <input type="text" name="cardCVV"><br>
		<input type="submit" value="BOOK Ticket"/>
</pre>
</form:form>
</body>
</html>