package com.te.ss;

public class Customer extends Thread {
	alcohol a;
	String name;
	String brand;

	public Customer(alcohol a, String name, String brand) {
		super();
		this.a = a;
		this.name = name;
		this.brand = brand;
	}

@Override
	public void run() {
a.buy(brand, 2);
	super.run();
	}
}
