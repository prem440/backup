package com.te.abstraction;

public abstract class cat {
	String name;
	
	cat(String a){
		this.name=a;
	}
	
	abstract void bark();
	
	public void poop() {
		System.out.println("dog are poop");
	}

}
