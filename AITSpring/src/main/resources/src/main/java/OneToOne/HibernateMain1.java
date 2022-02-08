package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain1 {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
		
//		Department d1=new Department(101,"IT");
//		ss.save(d1);
//		Employee e1=new Employee(1,"Rajdeep",30000,d1);
//		Department d2=new Department(102,"Sales");
//		ss.save(d2);
//		Employee e2=new Employee(2,"Omkar",35000,d2);
		Department d3=new Department(103,"Computer");
		ss.save(d3);
		Employee e3=new Employee(3,"akash",40000,d3);
		ss.save(e3);
		t.commit();

	}

}
