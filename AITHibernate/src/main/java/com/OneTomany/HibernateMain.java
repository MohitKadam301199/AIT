package com.OneTomany;

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
		
		Employee e1=new Employee(1,"Mohit");
		Employee e2=new Employee(2,"Rushi");
		Employee e3=new Employee(3,"Vijay");
		Employee e4=new Employee(4,"Rajdeep");
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		Department d=new Department(1, "IT", al);
		session.save(d);
		tx.commit();
	}

}
