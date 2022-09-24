package com.te.anotationconf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(LaptopConfig.class);
		Laptop bean = context.getBean(Laptop.class);
		System.out.println(bean);
		
	}

}
