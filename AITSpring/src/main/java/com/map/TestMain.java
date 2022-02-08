package com.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("map.xml");
		Institute i=(Institute)ac.getBean("i1");
		System.out.println(i);
	}

}
