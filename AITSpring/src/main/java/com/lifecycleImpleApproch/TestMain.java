package com.lifecycleImpleApproch;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("impl.xml");
		System.out.println("bean is create after call init() method");
		System.out.println("**************************");
		Student ob1=(Student) ctx.getBean("s1");
		System.out.println(ob1);
		System.out.println("after close() method destroy()method is call");
		ctx.close();
	}

}
