
package com.WithoutXMLObject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigurationFile.class);
		Student s1=ctx.getBean(Student.class);
		System.out.println(s1);

	}

}
