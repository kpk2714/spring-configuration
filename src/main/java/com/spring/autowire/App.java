package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("./config.autowire.xml");
		Student student = (Student) context.getBean("studentData");
		System.out.println(student);
	}
}
