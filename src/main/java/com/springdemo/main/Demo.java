package com.springdemo.main;

import 	org.springframework.stereotype.Service;

@Service("SpringDemo")

public class Demo {
	private String name;
	 
	public void setName(String name) {
		this.name = name;
	}
 
	public String sayHello() {
		return "Hello! " + name + "Welcome to Spring!!";
	}

}
