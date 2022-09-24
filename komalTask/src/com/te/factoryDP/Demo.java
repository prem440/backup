package com.te.factoryDP;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("if you want to know of about  tata ");
		System.out.println("enter 1 -for IT");
		System.out.println("enter 2 -for coffee");
		int d = sc.nextInt();
		if (d == 1)
			demo(d);
		else {
			demo1(d);
		}

	}

	private static void demo1(int d) {
		Production p = new Production();
		p.Starbucks();

	}

	private static void demo(int d) {
		Production p = new Production();
		p.tcs();
	}

}
class d{
	
}