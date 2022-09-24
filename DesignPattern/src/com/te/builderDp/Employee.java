package com.te.builderDp;

public class Employee {
	private int e_id;
	private String e_name;
	private double e_salary;
	private String e_designation;

	public Employee() {
		super();
	}

	private Employee(EmplyeeBuilder eb) {
		
		this.e_id = eb.e_id;
		this.e_name = eb.e_name;
		this.e_salary = eb.e_salary;
		this.e_designation = eb.e_designation;
	}

	public int getE_id() {
		return e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public double getE_salary() {
		return e_salary;
	}

	public String getE_designation() {
		return e_designation;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_salary=" + e_salary + ", e_designation="
				+ e_designation + "]";
	}
public static EmplyeeBuilder builder() {
	return new Employee().new EmplyeeBuilder();
}
	class EmplyeeBuilder {
		private int e_id;
		private String e_name;
		private double e_salary;
		private String e_designation;
		
		public EmplyeeBuilder id(int id) {
		this.e_id=id;
		return this;
		}
		public EmplyeeBuilder name(String name) {
			this.e_name=name;
			return this;
			}
		public EmplyeeBuilder designation(String dec) {
			this.e_designation=dec;
			return this;
			}
		public EmplyeeBuilder salary(double  sal) {
			this.e_salary= sal;
			return this;
			}
		public Employee build() {
			return new Employee(this);
		}
	}
}
