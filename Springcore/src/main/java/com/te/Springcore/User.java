package com.te.Springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
   
public static void main(String[] args) {
//	App a=new App();
//	
//a.setAge(43);
//a.setId(13);
//a.setName("kavi");
//
//ApplicationContext d= new ClassPathXmlApplicationContext("Spring.xml");
//App bean = d.getBean("ap" ,App.class);
//Object bean3=d.getBean("ap");
//App obj1=(App)bean3;
//obj1.setAge(23);
//System.out.println(obj1);
	
	
ApplicationContext api=new ClassPathXmlApplicationContext("testApp.xml");
//App bean3=api.getBean("App",App.class);
App bean=api.getBean("testApp",App.class);
//bean.getDatabase().save();
App sr=(App)api.getBean("testApp");
System.out.println(sr);
sr.getDatabase().save();

App bean1=api.getBean("testApp1",App.class);
//bean1.getDatabase().save();
App sr1=(App)api.getBean("testApp1");
System.out.println(sr1);
sr1.getDatabase().save();

	

}
}
