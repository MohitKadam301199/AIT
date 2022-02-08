package com.SterotypeComponentAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("componentType.xml");
		System.out.println("************");
		Employee ob1=(Employee) ctx.getBean("employee");
		System.out.println(ob1);
	}

}
