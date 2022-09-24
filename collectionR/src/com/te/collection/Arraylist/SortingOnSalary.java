package com.te.collection.Arraylist;

import java.util.Comparator;

public class SortingOnSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getSalary().compareTo(o2.getSalary());
	}


}
