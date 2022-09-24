package com.te.ktask;

public class Race extends Thread {
	static int balance;

	public void increment() {
		balance++;
		//System.out.println(balance);
	}

	public void decrement() {
		balance--;
		//System.out.println(balance);
	}
	public void display() {
		System.out.println(balance);
	}

	public static void main(String[] args) {
		Race r = new Race();
		Runnable r1 = () -> {
			r.increment();
			r.display();
		
		};
		Runnable r2 = () -> {
			r.decrement();
			r.display();
			
		};
		Thread t = new Thread(r1);
		Thread u = new Thread(r2);
		t.start();
		u.start();
		r.increment();
		r.decrement();
	}
}
