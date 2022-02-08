package com.lifecycleXMLfileApproch;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("xmlApproch.xml");
		System.out.println("bean is create after call init() method");
		System.out.println("**************************");
		Student ob1=(Student) ctx.getBean("s1");
		System.out.println(ob1);
		System.out.println("after close() method destroy()method is call");
		ctx.close();
		
		//lifecycle xml file approch
		//write own 2 method with any name
		//In .xml file In bean write inti-method="Mehod-name" destroy-Method="Method name"
	}

}
