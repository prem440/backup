package com.te.he;

import java.util.Scanner;

public class fnly {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
			int a=7;
			System.out.println(a>>1);
			a=sc.nextInt();
			int b;
			b=sc.nextInt();
			int res =0;
			res=a/b;
			int []x= {1,2,3,4,5,6,7};
			System.out.println(x[res]);
			System.out.println(res);
		} catch (Exception e) {
			System.out.println("arithmatic exception");
		}
		finally {
			System.out.println("connection closed");
		}
	}

}
