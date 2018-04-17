<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, th, td {
	border: 1px solid black;
}

table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: #f48f42;
    color: white;
    }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Orders</title>
</head>
<body>

<h1>Order Details</h1>
	
	<h1></h1>
		<table>
			<tr>
				<th>Order ID #</th>
				<th>Shipping Company</th>
				<th>Ship</th>
				<th>Date</th>
			</tr>
			<c:forEach items="${orderList}" var="orderList">
				<tr>
					<td>${orderList.oid}</td>
					<td>${orderList.shippingCompany.name}</td>
					<td>${orderList.ship.name}</td>
					<td>${orderList.date}</td>
				</tr>
			</c:forEach>
		</table>
		
	<a href="/">Home</a>

</body>
</html>