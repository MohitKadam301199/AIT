package com.ManyToone;

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
		
		Dept1 d1=new Dept1();
		d1.setDid(101);
		d1.setDname("IT");
		session.save(d1);
		
		Emp1 e1=new Emp1(1, "Mohit", d1);
		Emp1 e2=new Emp1(2, "Rohit", d1);
		Emp1 e3=new Emp1(3, "Suyash", d1);
		Emp1 e4=new Emp1(4, "Bablu", d1);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		
		tx.commit();
		
	}

}
