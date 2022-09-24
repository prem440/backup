package com.te.methodreference;

public class Test {
public void test() {
	System.out.println("namskar ! kasa ahes");
}
public void demo() {
	System.out.println("niwant");
}
public static void main(String[] args) {
	Test test=new Test();
	Tets t=test::test;
	t.m1();
	Tets t1=test::demo;
	t1.m1();
	
	
}
}
