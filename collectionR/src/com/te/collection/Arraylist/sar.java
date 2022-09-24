package com.te.collection.Arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

public class sar {
	public  void run() {
		System.out.println("r");
	}
	public static void main(String[] args) {
	 	String a[];
	 Vector g=new Vector<>();
	g.add(1);
	g.add("ravi");
	g.add("ravi1");
	 System.out.println(g.capacity());
	 ArrayList<Integer> gg=new ArrayList<>();
	 System.out.println(gg.size());
	 a=new String[10];
	 g.copyInto(a);
	System.out.println(a); 
	gg.add(67);
	gg.add(67);
	gg.add(67);
	gg.add(67);
	gg.add(67);
	gg.add(67);
	gg.add(67);
	gg.add(27);
	 gg.ensureCapacity(21);
	 gg.size();
	}
	

	
}
