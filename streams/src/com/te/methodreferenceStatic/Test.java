package com.te.methodreferenceStatic;

public class Test {
	public static String test( String f) {
		System.out.println("hello");
		return f;
	}
	public static void main(String[] args) {
//	Staticintrfc t= Test::test;
//	t.m1("hi");
//	String g=t.m1("hi");
//	System.out.println(g);
	//---------------------------------------------------
	Staticintrfc g=Test::test;
	System.out.println(g.m1("ravi"));
	
	}

}
