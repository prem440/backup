package com.te.collection.Treeset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Collectors;

public class first {
	public static void main(String[] args) {
		TreeSet<Object> t=new TreeSet<>();
		
		t.add(123);
		t.add(12);
		t.add(76);
		//System.out.println(t);
		
		for (Iterator iterator = t.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		//HashSet<Integer> f=new HashSet<>();
	List<Object> collect = t.stream().collect(Collectors.toList());
	System.out.println(collect);
		ArrayList<Integer>tf=new ArrayList(collect);
		System.out.println(tf);
			
		}
	}


