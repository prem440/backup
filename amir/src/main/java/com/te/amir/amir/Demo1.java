package com.te.amir.amir;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.amir.lifecycleofbean.Demo;

public class Demo1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("amir.xml");
	Object bean = context.getBean("amir");
	System.out.println(bean);
	}
}
