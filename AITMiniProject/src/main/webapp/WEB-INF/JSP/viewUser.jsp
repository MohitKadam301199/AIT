<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List,com.ait.Model.Product" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
</head>
<body>
<h1 style="background-color:DodgerBlue;">Welcome To Online shopping</h1>
<table border="2" style="width:100%">
<tr>
<th>Product_ID</th>
<th>Product_Name</th>
<th>Product_Price</th>
<th>Product_Color</th>
<th>Action</th>
</tr>
<c:forEach  var="p1" items="${prodUserlist}">
<tr>
<td>${p1.getProductId()}</td>
<td>${p1.getProductName()}</td>
<td>${p1.getProductPrice()}</td>
<td>${p1.getProductColor()}</td>
<td><a href="Addtocart?id=${p1.getProductId()}">AddToCart</a>

</tr>
</c:forEach>
</table>

<h4 align="center">
<a href="viewcart">ViewCart</a>
</h4>
<script>
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>

<h3><a href="logout">LogOut</a></h3>
</body>
</html>