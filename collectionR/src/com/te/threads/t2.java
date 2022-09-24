package com.te.threads;

public class t2 implements Runnable{

	@Override
	public void run() {
generateOtp();		
	}

	private void generateOtp() {
		System.out.println(Math.random()*10000);
		
		
	}

}
