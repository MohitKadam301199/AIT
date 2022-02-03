package com.ByDirectionMapping;

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
		Transaction tx=session.beginTransaction();
		
		Department2 d1=new Department2(101, "IT");
		Employee2 e1=new Employee2(1, "Abhimanyu", d1);
		Employee2 e2=new Employee2(2, "Avishkar", d1);
		Employee2 e3=new Employee2(3, "Varun", d1);
		
		ArrayList<Employee2> al=new ArrayList<Employee2>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		d1.setEmplist(al);
		
		session.save(d1);
		
	// when you use mapped by &cascade type then third table is not created and not compulsury to save all
		session.save(e1);
		session.save(e2);
		session.save(e3); 
		
		
		tx.commit();

	}

}
