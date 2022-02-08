package com.autowiredAnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("autoAnota.xml");
		//Student s=(Student) ctx.getBean("s1");
		//System.out.println(s);
		Student ss=(Student) ctx.getBean("s2");
		  System.out.println(ss);
		
		
		
		//you can use @Autowired upper setter /Constructor/containment var
	}
}
