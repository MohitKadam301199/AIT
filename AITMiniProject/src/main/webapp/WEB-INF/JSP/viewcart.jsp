<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List,com.ait.Model.Product"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
		</thead>
		<c:forEach var="p" items="${cartlist}">
			<tr>
				<td>${p.getProduct_name()}</td>
				<td>${p.getPrice()}</td>
			</tr>

		</c:forEach>


	</table>
	<div class="form-group">
		<div class="col-sm-9 col-sm-offset-3">
			<button type="submit" class="btn btn-primary btn-block">Checkout</button>
		</div>
	</div>

</body>
</html>