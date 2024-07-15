package com.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
    	ApplicationContext context = new ClassPathXmlApplicationContext("./config.xml");
    	Strudent student = (Strudent) context.getBean("studentData");
    	System.out.println(student);
	}
}
