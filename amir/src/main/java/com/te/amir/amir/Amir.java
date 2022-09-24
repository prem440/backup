package com.te.amir.amir;

import java.util.List;

public class Amir {
	private String name;
	private String last_name;
	private int age;
	private Phone phone;
	

	


	public Amir() {
		super();
	}


	public Amir(Phone phone) {
		this.phone = phone;
	}
	

	public Amir(String name, String last_name, int age) {
		super();
		this.name = name;
		this.last_name = last_name;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Amir [name=" + name + ", last_name=" + last_name + ", age=" + age + ", phone=" + phone + "]";
	}

}
