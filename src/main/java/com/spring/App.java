package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Strudent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("./comfig.xml");
        
        Student student = (Student) context.getBean("student1");
        System.out.println(student);
    	
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("./config.xml");
//    	Strudent student = (Strudent) context.getBean("studentData");
//    	System.out.println(student);
    }
}
