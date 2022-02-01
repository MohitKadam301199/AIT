package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.StudentDao;
import com.Dao.StudentDaoImpl;
import com.Model.Student;

@WebServlet("/")
public class StudentController extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("*********"+req.getServletPath());
		
		String operation=req.getServletPath();
		
		PrintWriter out=resp.getWriter();
		StudentDao sdao=new StudentDaoImpl();
		
		switch(operation)
		{
		
		case "/delete":int sid=Integer.parseInt(req.getParameter("id"));
		              sdao.deleteStudentById(sid);
		              resp.sendRedirect("lst");
		              break;
		              
		case "/edit":sid=Integer.parseInt(req.getParameter("id"));
		             Student ob=sdao.getStudentById(sid);
		             req.setAttribute("sobj", ob);
		             RequestDispatcher rdd=req.getRequestDispatcher("edit.jsp");
		             rdd.forward(req, resp);
		             break;
		             
		case"/save":sid=Integer.parseInt(req.getParameter("sid"));
		            String nm=req.getParameter("sname");
		            int percent=Integer.parseInt(req.getParameter("percent"));
		            String city=req.getParameter("city");
		            Student s1=new Student(sid, nm, percent, city);
		            sdao.updateStudent(s1);
		            resp.sendRedirect("lst");
		            break;
		             
		default: List<Student> slist=sdao.getAllStudents();
				System.out.println(slist);
				req.setAttribute("name","Mohit");
		         req.setAttribute("studlist", slist);
		         RequestDispatcher rd=req.getRequestDispatcher("view.jsp");
		         rd.forward(req, resp);
		
		}
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	}
	
}
