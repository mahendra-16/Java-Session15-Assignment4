package com.apps.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainJava {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person person = (Person) context.getBean("person");
		Persontype ptype = person.getType();
		System.out.println(ptype.getTypeName());
		
	}

}
