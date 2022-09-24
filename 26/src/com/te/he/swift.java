package com.te.he;

public class swift extends engine {
static int p;
	swift(int power){
		this.p=power;
		power();
	}
	@Override
	public void power() {
		System.out.println(p);
		
	}
	
}
