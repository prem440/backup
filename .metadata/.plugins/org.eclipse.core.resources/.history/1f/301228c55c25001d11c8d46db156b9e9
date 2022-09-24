package com.te.packages.Object;

public class Test implements Cloneable {
	String name;

	public static void main(String[] args) throws CloneNotSupportedException {
		Test t = new Test();
		t.name = "ravi";
		Test tt = new Test();
		Test c = (Test) t.clone();
		System.out.println(c.hashCode());
		System.out.println(t.clone());
		System.out.println(t.hashCode());
		System.out.println(c.name);
		String a = "ravi";
		String aa = "ravi";
		boolean aaa = (a == aa);
		boolean aaaa = (a.equals(aa));
		System.out.println(aaa);
		System.out.println(aaaa);
		System.out.println(a.hashCode());
		System.out.println(aa.hashCode());

	}
}
