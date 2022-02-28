<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #04AA6D;
  color: white;
}

table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
  text-align: center;
}

table.center {
  margin-left: auto; 
  margin-right: auto;
}
 
marquee {
        
        background-color: lightblue;
      }
</style>
</head>
<body>
<div class="topnav">
  <a class="active" href="">Home</a>
  <a href="">News</a>
  <a href="">Contact</a>
  <a href="">About</a>
</div>
<marquee><h1> welcome to online shopping </h1></marquee>

<h4>Online shopping System is the application that allows the user to shop online without time wasting Online stores do not have space constraints and a wide variety of products can be displayed on websites. It helps the analytical buyers to purchase a product after a good search.</h4>
<form method="get" action="validateuser" >
        <table class="center">
            <tr>
                <th> <label>Enter your name : </label> </th>
                <td> <input type="text" name="userName" placeholder="enter your full name" autofocus required/> </td>
            </tr>
            <tr>
                <th> <label>Enter Password : </label> </th>
                <td> <input type="password" name="userpassword" placeholder="enter your password"/> </td>
            </tr>
            <tr>
            
            <td>
                 <input type="submit" value="Login">
            </td>
            <td><a href="signup">Signup</a>
            </td>
            </tr>
            
               

        </table>
    </form>
</body>
</html>

