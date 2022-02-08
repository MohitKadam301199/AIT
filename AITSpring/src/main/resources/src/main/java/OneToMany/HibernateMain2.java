package OneToMany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain2 {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
		
		
//		Customer c1=new Customer(1,"John");
//		Customer c2=new Customer(2,"joe");
//		ss.save(c1);
//		ss.save(c2);
//		List<Customer>li=Arrays.asList(c1,c2);
//		Vendor v1=new Vendor(101,"Amazon",li);
//		ss.save(v1);
//		Customer c3=new Customer(3,"jane");
//		Customer c4=new Customer(4,"ron");
//		ss.save(c3);
//		ss.save(c4);
//		List<Customer>lii=Arrays.asList(c3,c4);
//		Vendor v2=new Vendor(102,"Flipkart",lii);
//		ss.save(v2);
		Customer c1=new Customer(1,"john");
		Customer c2=new Customer(2,"joe");
		List<Customer>lii=Arrays.asList(c1,c2);
		ss.save(c1);
		ss.save(c2);
		Customer c3=new Customer(3,"jane");
		Customer c4=new Customer(4,"ron");
		ss.save(c3);
		ss.save(c4);
		List<Customer>li=Arrays.asList(c3,c4);
		Vendor v1=new Vendor(101,"Amazon",lii);
		Vendor v2=new Vendor(102,"Flipkart",li);
		ss.save(v1);
		ss.save(v2);
		t.commit();
		sf.close();
		ss.close();
		

	}

}
