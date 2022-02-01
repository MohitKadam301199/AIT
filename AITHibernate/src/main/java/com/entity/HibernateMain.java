package com.entity;

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
		Student s1=new Student();
		s1.setSid(2);
		s1.setSname("Mohit");
		s1.setPercent(95);
		session.save(s1);
		tx.commit();
		

	}

}
