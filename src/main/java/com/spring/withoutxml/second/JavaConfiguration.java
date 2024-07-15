package com.spring.withoutxml.second;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

	@Bean
	public Address getAddress() {
		Address address = new Address();
		return address;
	}
	
	@Bean("student")
	public Student getStudent() {
		Student student = new Student(getAddress());
		return student;
	}
}
