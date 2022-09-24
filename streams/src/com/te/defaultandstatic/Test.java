package com.te.defaultandstatic;

public interface Test{
public static void m1() {
	System.err.println("its static method");
}
public default void m2() {
	System.err.println("this is default method ");
}
}
