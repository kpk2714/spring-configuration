package com.spring.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
	}
}
