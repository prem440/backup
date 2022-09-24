package com.te.collection.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class FirstProgram {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(12);
		a.add("ravi");
		a.add(true);
		a.add('r');
		a.add(null);
		System.out.println("----------using for loop-----------");
		for (int i = 0; i < a.size(); i++) {
System.out.println(a.get(i));
		}
		System.out.println("-------------using for each--------------");
		for(Object o:a) {
		
			System.out.println(o);
		}
		System.out.println("------------------using iterator-----------------------");
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			
			System.out.println(i.next());
		}
	}

}
