package com.oneToone;

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
		
		Vehicle1 v1=new Vehicle1();
		v1.setVid(7565);
		v1.setVname("bullet");
		Person1 p1=new Person1(51,"Rashmi", 9658741235l, v1);
		v1.setPerson(p1);
		session.save(v1);
		session.save(p1);
		tx.commit();

	}

}
