<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
table {
  border-collapse: collapse;
  border: 1px solid #ddd;
}

th, td {
  text-align: left;
  padding: 16px;
}

table.center {
  margin-left: auto; 
  margin-right: auto;
}
h1{
  background-color: lightblue;
  text-align: center;
  }
</style>

</head>
<body>
<form action="saveuser">
<h1>  User login</h1>
<table class="center">
            <tr>
                <th> <label> Enter your name : </label> </th>
                <td> <input type="text" name="uname" placeholder="enter your full name" autofocus required/> </td>
            </tr>
            <tr>
                <th> <label> Password : </label> </th>
                <td> <input type="password" name="upass"/> </td>
            </tr>
            <tr>
                <th> <label> Gender</label> </th>
                <td> <input type="radio" name="Gender"/> female
                     <input type="radio" name="Gender"/> male</td>
            </tr>
            <tr>
                <th> <label> Age : </label> </th>
                <td> <input type="text" name="uage"/> </td>
            </tr>
            <tr>
                <th> <label> Enter your email : </label> </th>
                <td> <input type="email" name="uemail"/> </td>
            </tr>
            <tr>
                <th> <label> Mobile No :</label> </th>
                <td> <input type="tel" name="uph"/> </td>
            </tr>
            <tr>
                <td> </td>
                <td>
                    <input type="submit" value="submit">
                    <input type="reset">
                </td>
            </tr>
            

        </table>
        </form>
</body>
</html>