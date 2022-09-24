package com.te.he;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// a z=new a();
//	System.out.println(z.d);
		// Object obj[];
		// obj=new a[3];
// a t1=new a();
		// a t2=new a();
		// a a1[]=new a[3];
		// a a2[]= {t1,t2};
// System.out.println(obj);
		Scanner sc = new Scanner(System.in);
System.out.println("enter value 1st value");
int d ;
		d = sc.nextInt();
// System.out.println(t1.hashCode());
		System.out.println("2 value ");
		int f ;
		f= sc.nextInt();
		int v=0;
		try {
			v = d / f ;
			int[] x= {1,2,3,4,5,6,7,8,9};
		System.out.println(x.length);
			System.out.println(x[v]);
		
		} catch (IndexOutOfBoundsException e)
		{
			System.out.println("enter valid input"+e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(v);
		
	}
}
