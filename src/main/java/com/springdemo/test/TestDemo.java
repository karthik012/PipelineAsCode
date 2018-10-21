package com.springdemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springdemo.main.Demo;

public class TestDemo {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo demo = (Demo) context.getBean("SpringDemo");
		
		String message = demo.sayHello();
		System.out.println(message);
		
		demo.setName("Spring");
		message = demo.sayHello();
		System.out.println(message);
		
	}

}
