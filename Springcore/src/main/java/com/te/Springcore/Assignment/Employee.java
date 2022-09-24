package com.te.Springcore.Assignment;

public class Employee {
	private String name;
	private int id;
	private long sal;
	private String city;
	private Addres 	adrs;
	
	
	public Addres getAdrs() {
		return adrs;
	}
	public void setAdrs(Addres adrs) {
		this.adrs = adrs;
	}
	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + ", city=" + city + ", adrs=" + adrs + "]";
	}
	
	public Employee(String name, int id, long sal, String city, Addres adrs) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.city = city;
		this.adrs = adrs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
