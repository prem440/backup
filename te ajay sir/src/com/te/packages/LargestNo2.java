package com.te.packages;

public class LargestNo2 {
	static int x =0;
public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
	int d=67;
	int e=32;
	
	if(a>b && a>c && a>d && a>e)
	{
		x=a;
	}
	else if(b>c && b>d && b>e && b>a) {
		x=b;
	}
	else if(c>d && c>e && c>a && c>b) {
		x=c;
	}
	else if(d>a && d>b && d>c && d>e)
	{
		x=d;
	}
	else if(e>a && e>b && e>c && e>d ) {
		x=e;
	}
	System.out.println(x);
}
}
