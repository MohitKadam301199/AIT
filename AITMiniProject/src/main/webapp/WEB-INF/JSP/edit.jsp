<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Product</h1>
<FORM method="get" action="update" >
<table>
<tr>
<th>Product Name:</th>
<td> <input type="text" name="pname" value="${product.getProductName()}"></td>
</tr>
<tr>
<th>Product Price:</th>
<td><input type="text" name="price" value="${product.getProductPrice()}"></td>
</tr>
<tr>
<th>Product Color:</th>
<td><input type="text" name="pcolor" value="${product.getProductColor()}"></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="submit">
</td>
</tr>

</table>
</FORM>
</body>
</html>