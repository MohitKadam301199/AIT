package com.CollectionList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext a=new ClassPathXmlApplicationContext("list.xml");
		Employee e1=(Employee)a.getBean("e1");
		System.out.println(e1);
	}
}
