package com.te.he;

public class arrays {
	static String s="ravi";
	public static void main(String[] args) {
		int[] a= {11,12,22,2,2,1};
		int b[];
		b=new int[4];
		for(int i=0;i<b.length;i++) {
			//b[i]=i+1;
			System.out.println(b[i]+s);
		}
		System.out.println("--------------------------------------------------------------");
		
		
		for(int i=0;i<args.length;i++)
		{
			args[i]=s;
		System.out.println(args.length);
		System.out.println(args[i]=s);
		}
		Object []s;
		s=new Object[3];
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
