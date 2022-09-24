package com.te.packages;

public class Test {
	private int p;
	protected transient int t;
	public int pu;
	int d;

	private void m1() {
		System.out.println("i am private");
	}

	public void m2() {
		System.out.println("i am public");
	}

	protected void m3() {
		System.out.println("i am protected");
	}

	void m4() {
		System.out.println("i am default");
	}

public static void main(String[] args) {
	Test t1=new Test();
	System.out.println(t1.p);
	System.out.println(t1.t);
	System.out.println(t1.pu);
	System.out.println(t1.d);
	t1.m1();
	t1.m2();
	t1.m3();
	t1.m4();
}
}
