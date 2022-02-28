<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List,com.ait.Model.Product" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #D6EEEE;
}
h3{
align-content: center;
}
</style>


</head>
<h2><a href="add">Add Product</a></h2>
<table border="2">
<tr>
<th>Product_ID</th>
<th>Product_Name</th>
<th>Product_Price</th>
</tr>
<c:forEach  var="p1" items="${prodlist}">
<tr>
<td>${p1.getProductId()}</td>
<td>${p1.getProductName()}</td>
<td>${p1.getProductPrice()}</td>
<td>${p1.getProductColor()}</td>
<td><a href="edit?id=${p1.getProductId()}">Edit</a>
<a href="delete?id=${p1.getProductId()}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>