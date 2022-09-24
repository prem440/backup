package com.te.Strem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.te.collection.Arraylist.Employee;

public class AllMatch {

	public static void main(String[] args) {
		List<Employee> AsListt = Arrays.asList(new Employee(1, "triple h", 99999.5),
				new Employee(2, "randi orton", 499899), new Employee(3, "brock lesnor", 563899),
				new Employee(4, "john sena", 7676767));
	
		Stream<Employee> stream = AsListt.stream();
		boolean allMatch = stream.anyMatch((e1) -> e1.getName().equals("triple h"));
		System.out.println(allMatch);
	}
}
