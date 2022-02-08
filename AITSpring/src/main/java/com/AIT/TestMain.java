package com.AIT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Student ob=(Student) ctx.getBean("s1");
		System.out.println(ob);
		Student ob1=(Student) ctx.getBean("s2");
		System.out.println(ob1);
		
		
		System.out.println("***** Scope prototype ******");
		Student ob3=(Student) ctx.getBean("s3");
		System.out.println(ob3);
		
		
		

	}

}
