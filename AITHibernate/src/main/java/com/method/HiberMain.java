package com.method;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HiberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		
		
//		          ************Get Method*************
//		  suppose in DB already data is filap
//        get student return mde data asel tr to dete nsel tr null dete
//		  Student1 ob=session.get(Student1.class, 3);
//		  System.out.println(ob);
		
		
//                ************load Method************
//	      same as get method. diff is only if no record available in DB then load method return error and get method return null
//		  Student1 ob1=session.load(Student1.class, 2);
//		  System.out.println(ob1);
		
		
//               *************Delete Method***********
//        delete method delete record
//		  Student1 ob2=session.get(Student1.class, 1);
//		  
//		  if(ob2!=null)
//		  {
//			  session.delete(ob2);
//			  System.out.println(ob2);
//		  }
		
//        Transient Presistence
//        it use for instant variable & not create colun and not add data in DB
//		  Student1 s2=new Student1(1, "Rakesh", 56, 123);
//		  session.save(s2);

//         Object relavant 3 state
		
//         1.transisent ---before save you change or set any variable this is transient
//	      Student1 s3=new Student1(9, "saurab", 65, 213);
//	      s3.setSname("Aniket");                                                             //transisent
//	      session.save(s3);
		
//        2.presient ---	call save is persient
//	      Student1 s4=new Student1(10, "Pavan", 69, 243);
//	      session.save(s3);                                                                  //persient
		
//        3.Deteched  --close method nantr change or set any variable this is Deteched
//		  Student1 s5=new Student1(11, "Sachin", 66, 143);
//	      session.save(s5);  
//		  tx.commit();
//		  session.close();                                                                   //close method close all insertion
//		  s5.setSname("Bhavesh");                                                            //Deteched
		

//        *******************Clear*************************
//		  clear method delete all record	
//	      session.clear();	
		
		Student1 s6=session.get(Student1.class, 1);
		s6.setSname("Varun");
		session.saveOrUpdate(s6);
		
		tx.commit();
	}

}
