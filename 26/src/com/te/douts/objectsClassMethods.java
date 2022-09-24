package com.te.douts;

public class objectsClassMethods {

	public static void main(String[] args) {
		byte d = 20;
		Byte b = Byte.valueOf(d);
		System.out.println(b);
		int a = b.intValue();
		System.out.println(a);
		byte c = d;
		System.out.println(c);
		 String e = "ravi";//  bbbbbbbbbbbbbbbbbbb
		String f = e;
		boolean g = e == f;
		System.out.println(e.equals(f));
		System.out.println(g);
		String a1=new String("ravi");
		String a2=new String("ravi");
		System.out.println(a1.equals(a2));
		System.out.println(e.equals(a1)+"hi");
		boolean d1=e==a1;
		System.out.println(d1);
	System.out.println(e.equals(a1));
	boolean aa=(a1==a2);
	Boolean e1=aa;
	System.out.println(aa);
	System.out.println(e1);
	}

}
