package com.te.Springcore.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Data {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Emp.xml");
		Employee bean = context.getBean("Emp1",Employee.class);
		System.out.println(bean);
		System.out.println("-----------------------1----------------");
		Employee bean2 = context.getBean("Emp2",Employee.class);
		System.out.println(bean2);
		System.out.println("-------------------------2----------------");
		Employee bean3 = context.getBean("Emp4",Employee.class);
		System.out.println(bean3);	
	}

}
