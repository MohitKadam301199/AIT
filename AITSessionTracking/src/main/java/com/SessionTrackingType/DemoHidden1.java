package com.SessionTrackingType;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hidden2")
public class DemoHidden1 extends HttpServlet {
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		 String nm="Mohit";
		 out.print("<html><body>");
		 out.print("<h1> Welcome to URL REwriting session</h1>");
		 
		 out.print("<form action = 'hidden3' method='post' >");
		 out.println("<a href='hidden3?user"+nm+"'> Next</a>");
		 //out.print("<input type='hidden' name='username' value='mohit'>");
		 out.print("<input type='submit' value='submit'>");
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}