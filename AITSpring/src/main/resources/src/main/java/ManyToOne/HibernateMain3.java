package ManyToOne;


import org.hibernate.query.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain3 {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("Hibernate.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
		
//		Division d1=new Division("A",1);
//		ss.save(d1);
//		Student s1=new Student(101,"Rajdeep",d1);
//		Student s2=new Student(102,"Omkar",d1);
//		ss.save(s1);
//		ss.save(s2);
//		
//		Student s3=ss.get(Student.class,101);
//		System.out.println(s3);
		
		Query q=ss.createQuery("from Student");//select query
		List<Student>li=q.list();
		for(Student s:li) 
		{
			System.out.println(s);
		}
		t.commit();

	}

}
