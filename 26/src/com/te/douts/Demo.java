package com.te.douts;

import java.util.Scanner;





public class Demo {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		Demo d=new Demo();
		d.acceptInput();
	}

	private  void acceptInput() {
		System.out.println("enter the String");
		String input=s.nextLine();
		Demo d=new Demo();
		
		d.arrayReverse(input);
		
	}

	private  void arrayReverse(String input) {
		String s[]=new String[input.length()];
		char[] f=input.toCharArray();
		//System.out.println(f);
		for (int i =f.length-1; i >=0; i--) {
			System.out.print(input.charAt(i));
			
			
		}
		
	
		
	}
			
		
	}


