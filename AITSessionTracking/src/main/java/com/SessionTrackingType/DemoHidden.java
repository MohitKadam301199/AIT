package com.SessionTrackingType;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hidden1")
public class DemoHidden extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		 out.print("<html><body>");
		 out.print("<h1> Welcome user to demo og hidden field </h1>");
		 out.println("<form action='hidden2'>");
		 out.println("<input type='hidden' name='username' value='Mohit'>");
		 out.println("<input type='Submit' value='submit'>");
		 //out.println("username ="+req.getParameter("user"));
		 out.println("</body></html>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}