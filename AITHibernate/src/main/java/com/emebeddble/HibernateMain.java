package com.emebeddble;

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
		
		StudDetails sd=new StudDetails();
		sd.setSid(1);
		sd.setSname("Mohit");
		sd.setPercent(65);
		
		Address a=new Address();
		a.setAdr1("srno69");
		a.setCity("Malegoan");
		a.setLandmark("DKChouk");
		
		sd.setAddr(a);
		
		session.save(sd);
		tx.commit();
		
		
		

	}

}
