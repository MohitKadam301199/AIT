<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<FORM method="get" action="" >
<table>
<tr>
<th>User Name:</th>
<td> <input type="text" name="uname"></td>
</tr>
<tr>
<th>User password:</th>
<td><input type="password" name="password"></td>
</tr>
<tr>
<th>Gender:</th>
<td> <input type="radio" name="Gender"/> female</td>
<td> <input type="radio" name="Gender"/> male</td>
</tr>
<tr>
<th>Age:</th>
<td><input type="text" name="age"></td>
</tr>
<tr>
<th>Number:</th>
<td><input type="text" name="number"></td>
</tr>

<tr>
<td><a href="save"></a><input type="submit" value="singIn"></td>
<td><a href=""></a><input type="submit" value="singUp"></td>
</tr>
</table>
</FORM>
</body>
</html>