package com.te.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TMap {
public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<>();
	map.put(1, "ravi");
	map.put(2, "kavita");
	map.put(3, "raju");
	map.put(4, "soma");
	map.put(5, "aman");
	
	ArrayList<String>a=new ArrayList<>();
	for (int i = 1; i <= map.size(); i++) {
		a.add(map.get(i));
		
		
	}
	System.out.println(a);
	Collections.sort(a);
	System.out.println(a);
	
	
//	Set<Integer> ks=map.keySet();
//	Iterator<Integer> i=ks.iterator();
//	while (i.hasNext()) {
//		Integer k = (Integer) i.next();
//		System.out.println(k+":-:"+map.get(k));
	
	}
	
}

