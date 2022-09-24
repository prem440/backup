package com.te.collection.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class test1 {
	public static void main(String[] args) {
		Set<Integer> i=new HashSet<>();
		i.add(1);
		i.add(324);
		i.add(36);
		i.add(98987);
		i.add(345);
		List<Integer> al=new ArrayList<>(i);
		Collections.sort(al);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()) {
			Integer ii=it.next();
			System.out.println(ii);
			
		}
		
	}

}
