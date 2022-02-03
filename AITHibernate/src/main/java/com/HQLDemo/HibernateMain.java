package com.HQLDemo;

import java.util.List;

import javax.persistence.Query;

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
		
	/*	Query q=session.createQuery("from Teacher");
		List<Teacher> al=q.getResultList();
		for(Teacher t:al)
			System.out.println(t);
    */
	
		
	/*	Query q=session.createQuery("from Teacher where tsub='java'");
		List<Teacher> al1=q.getResultList();
		for(Teacher t1:al1)
			System.out.println(t1);			
	*/
		
	/*	Query q=session.createQuery("select tname from Teacher");
		List<String> al2=q.getResultList();
		for(String t2:al2)
			System.out.println(t2);
	*/
		
	/*	Query q=session.createQuery("select tname from Teacher order by tname desc");
		List<String> al3=q.getResultList();
		for(String t3:al3)
			System.out.println(t3);
	*/
		
		
   	/*	Query q=session.createQuery("update Teacher set tname=:a where tid=:b");
		q.setParameter("a", "Mohit");
		q.setParameter("b", 4);
		q.executeUpdate();
	*/
		
	
		
	}

}
