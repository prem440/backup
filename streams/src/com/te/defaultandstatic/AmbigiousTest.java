package com.te.defaultandstatic;

public interface AmbigiousTest {
public default void  m2() {
	System.err.println("its ambigious test");
}
}
