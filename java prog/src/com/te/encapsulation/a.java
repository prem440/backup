package com.te.encapsulation;

public class a {
private String name;
private int age;
private int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age>18)
	{
	this.age = age;
	System.out.println("you are eligible ");
}
	else {
		System.out.println("you not eligible ");
	}}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
