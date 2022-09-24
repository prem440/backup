package com.te.amir.lifecycleofbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.amir.amir.Amir;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
		Demo bean = context.getBean("ravi",Demo.class);
		bean.m1();
		
		
	}

}
