package com.te.Springcore;

/**
 * Hello world!
 *
 */
public class App {
	
	public App() {
		super();
	}

	private int id;
	private String name;
	private int age;
	private	Database database;

	public static void main(String[] args) {
		// System.out.println( "Hello World!" );

	}

	public App(int id, String name, int age, Database database) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.database = database;
	}

	@Override
	public String toString() {
		return "App [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	public Database getDatabase() {
		return database;
	}

	public App(Database database) {
		super();
		this.database = database;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
		this.age = age;
	}
}
