package com.te.homework;

import java.util.Scanner;

public class owndemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the pin for your fav car....");
		System.out.println("101 for MGHector");
		System.out.println("102 for suzuki-swift");
		System.out.println("103 for tesla");
		int store=sc.nextInt();
		driver d=new driver();
		d.getcar(store);

	}
}
