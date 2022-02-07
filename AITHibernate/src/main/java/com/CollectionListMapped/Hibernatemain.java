package com.CollectionListMapped;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Hibernatemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction tx=null;
		tx=session.beginTransaction();
		
		Answer1 an1=new Answer1(); 
	    an1.setAnswername("Java is a programming language");  
	    session.save(an1); 
	      
	    Answer1 an2=new Answer1();  
	    an2.setAnswername("Java is a platform"); 
	    session.save(an2);
	    
	     
	    Question1 q1=new Question1();  
	    q1.setQname("What is Java?");  
	    ArrayList<Answer1> l1=new ArrayList<Answer1>();  
	    l1.add(an1);  
	    l1.add(an2);  
	    q1.setAnswers(l1);  
	      
	      
	    Answer1 ans3=new Answer1();    
	    ans3.setAnswername("Servlet is an Interface");  
	    session.save(ans3);
	            
	            
	    Answer1 ans4=new Answer1();    
        ans4.setAnswername("Servlet is an API");    
        session.save(ans4);  
	      
	    Question1 q2=new Question1();  
	    q2.setQname("What is Servlet?");  
	    ArrayList<Answer1> l2=new ArrayList<Answer1>();  
	    l2.add(ans3);  
	    l2.add(ans4);  
	    q2.setAnswers(l2);  
	      
	    session.save(q1);    
	    session.save(q2);    
	        
	    tx.commit();    
	      
	}

}

