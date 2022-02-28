package com.tqpp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nm=request.getParameter("fname");
		String email=request.getParameter("email");
		
		//comment code is Self code
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor='red'> <h1> Welcome user "+nm+"</h1>");
		out.print("<h3> Your email is "+email+"</h3>");
		out.print("</body></html>");
		
		
		//this code is for Student third code
//		RequestDispatcher rd=request.getRequestDispatcher("Add.jsp");
//		rd.forward(request, response);
		
	
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	}

}
