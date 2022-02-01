package com.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	private static final String URL="jdbc:mysql://localhost:3306/dbms1";
	  private static final String USERNAME="root";
	  private static final String PASSWORD="301199";
	  
	  public static Connection getConnection()
	  {
		  Connection con=null;
		  try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return con;
		  
		  
	  }
	  public static void main(String[] args) {
		Connection c=DBConnect.getConnection();
		if(c!=null)
		{
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}


}
