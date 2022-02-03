package com.inherit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Teacher1 t1=new Teacher1(1, "Kirti");
		VisitingTeacher v1=new VisitingTeacher(2,"Deepa",10,20000);
		PermanentTeacher p1=new PermanentTeacher(3,"Medha",50000);
		session.save(t1);
		session.save(v1);
		session.save(p1);
		
		tx.commit();
		

	}

}
