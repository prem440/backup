package com.te.ss;

public class Suplier extends Thread {
	alcohol a;
	String name;
	String brand;

	public Suplier(alcohol a,String name) {
		super();

		this.name = name;
		this.a = a;
	}

	public String GetBrand() {
		return brand;
	}

	public void SetBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public void run() {
		System.out.println("suplier");
		a.refillStock(brand, 100);
		super.run();
	}

}
