<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 16-08-2017
  Time: 08:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<title>Flight Details</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>spring boot form submit example</title>
</head>


<body>

	<h2>Flight Search Results:</h2>

	<h3>${sourceCity}to ${destCity} Search Results</h3>
	<table>

		<c:forEach items="${flights}" var="f">
			
			<tr>
				<td><b>FlightNo: </b>
				<c:out value="${f.flightNo}" /></td>
			</tr>

			<td><b>price:</b> <c:out value="${f.price}" /></td>
			</tr>
			</tr>
			<td><b>AirLine name:</b> <c:out value="${f.airlineName}" /></td>
			</tr>
			</tr>
			<td><b>departure time: </b>
			<c:out value="${f.deptTime}" /></td>
			</tr>
			</tr>
			<td><b>duration:</b> <c:out value="${f.duration}" /></td>
			</tr>
			</tr>
			<td><b>total stops: </b>
			<c:out value="${f.totalStops}" /></td>
			

		</c:forEach>
	</table>
</body>
</html>
