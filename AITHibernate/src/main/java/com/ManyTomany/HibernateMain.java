package com.ManyTomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction tx=null;
		tx=session.beginTransaction();
		
		Answer an1=new Answer(); 
	    an1.setAnswername("Java is a programming language");  
	     
	      
	    Answer an2=new Answer();  
	    an2.setAnswername("Java is a platform");  
	    
	    session.save(an1);
	    session.save(an2);
	    Question q1=new Question();  
	    q1.setQname("What is Java?");  
	    ArrayList<Answer> l1=new ArrayList<Answer>();  
	    l1.add(an1);  
	    l1.add(an2);  
	    q1.setAnswers(l1);  
	      
	      
	    Answer ans3=new Answer();    
	    ans3.setAnswername("Servlet is an Interface");    
	            
	            
	    Answer ans4=new Answer();    
        ans4.setAnswername("Servlet is an API");    
           
        session.save(ans3);
 	    session.save(ans4);  
 	    
	    Question q2=new Question();  
	    q2.setQname("What is Servlet?");  
	    ArrayList<Answer> l2=new ArrayList<Answer>();  
	    l2.add(ans3);  
	    l2.add(ans4);  
	    q2.setAnswers(l2);  
	      
	    session.save(q1);    
	    session.save(q2);    
	        
	    tx.commit();    
	    session.close();    
	    System.out.println("success");    
	}

}
