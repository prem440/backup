package com.te.collection.Arraylist;



public class Employee implements Comparable<Employee> {
	private Integer id;
	private String name;
	private Double salary;

	

	public Employee(int id, String string, double salary) {
		super();
		this.id = id;
		this.name = string;
		this.salary = salary;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;

	}
	
}
