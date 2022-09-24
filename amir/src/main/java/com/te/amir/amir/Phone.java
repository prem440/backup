package com.te.amir.amir;

public class Phone {
	private String model;
	private String brand;
	private String price;
	
	
	public Phone() {
		super();
	}
	public Phone(String model, String brand, String price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}

}
