package com.te.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class First {
	@Override
	public String toString() {
		return "First [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public static void main(String[] args) {
		HashMap<String,Integer>hs=new HashMap<>();
		hs.put("ravi", 1);
		hs.put("anil", 2);
		hs.put("mona", 4);
	 
//	 Set<String> sorted = hs.keySet().stream().sorted(Comparator.).collect(Collectors.toSet());
	// System.out.println(sorted);
	 
//	 hs.keySet().stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
//	
//	System.out.println(hs.get("ravi"));
	List<String> collect = hs.keySet().stream().collect(Collectors.toList());
	System.out.println(collect);
ArrayList<Object>r=new ArrayList<>(collect);
System.out.println(r);
List<Integer> collect2 = hs.values().stream().collect(Collectors.toList());
	System.out.println(collect2);
ArrayList<Integer> arrayList = new ArrayList<>(collect2);
	System.out.println(arrayList                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        );
	}
}
