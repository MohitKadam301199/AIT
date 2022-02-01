package com.SessionTrackingType;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie1")
public class Cookie1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie ck = new Cookie("name","Kanchan");
		//ck.setMaxAge(60*60);
		PrintWriter out = response.getWriter();
		 out.print("<html><body>");
		 out.print("<h1> Welcome to cookies session 2</h1>");
		 out.print("<a href = 'cook2'> Next</a>");
		 response.addCookie(ck);
		
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			doGet(request, response);
		}

}
