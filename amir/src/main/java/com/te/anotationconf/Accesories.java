package com.te.anotationconf;

public class Accesories {
	private int quantity;
	private long totalprice;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getTotalprice() {
		return totalprice;
	}
	public Accesories(int quantity, long totalprice) {
		super();
		this.quantity = quantity;
		this.totalprice = totalprice;
	}
	public void setTotalprice(long totalprice) {
		this.totalprice = totalprice;
	}
	@Override
	public String toString() {
		return "accesories [quantity=" + quantity + ", totalprice=" + totalprice + "]";
	}
	public Accesories() {
		super();
	}
	

}
