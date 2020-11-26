<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Reservation</title>
</head>
<body>
<h1>Find Flights</h1>
<form:form action="findFlights" method="POST">
<pre>
		  From : <input type="text" name="from">
		    To : <input type="text" name="to">
Departure Date : <input type="date" name="departureDate">
			<input type="submit" value="Find">
</pre>
</form:form>

<table cellspacing="20">
	<tr>
		<th>Airline Name</th>
		<th>Departure City</th>
		<th>Arrival City</th>
		<th>Departure Date</th>
		<th>Departure Time</th>
	</tr>
	<c:forEach var="flight" items="${flights}">
		<tr>
			<td>${flight.operatingAirlines}</td>
			<td>${flight.departureCity}</td>
			<td>${flight.arrivalCity}</td>
			<td>${flight.dateOfDeparture}</td>
			<td>${flight.estimatedDepartureTime}</td>
			<td><a href="flightFinalize?flightId=${flight.id}">Select</a>
		</tr>
	</c:forEach>
	
</table>
<h3>${msg2}</h3>

</body>
</html>