package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring1.xml");
		//Teacher t=(Teacher) ctx.getBean("t1");
		//System.out.println(t);
		Teacher tt=(Teacher) ctx.getBean("t2");
		System.out.println(tt);

	}

}
