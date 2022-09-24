package com.te.Strem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.te.collection.Arraylist.Employee;

public class Test {
	public static void main(String[] args) {

		List<Employee> aslist = Arrays.asList(new Employee(1, "amit", 24390), new Employee(2, "vinayak", 357689),
				new Employee(3, "darsha", 215614));
	Comparator<Employee> com = (Employee e1, Employee e2) -> {
		return e1.getSalary().compareTo(e2.getSalary());

		};
		Collections.sort(aslist, com);
		System.out.println(aslist.stream().max(com));
		Function<Employee, Double> f = (e) -> {
			return e.getSalary();
		};
		// for max salary
		aslist.stream().max(Comparator.comparing(f)).ifPresent(System.out::println);
		// for min salary
		aslist.stream().min(Comparator.comparing(f)).ifPresent(System.out::println);
		//sorted method
		//aslist.stream().sorted((ee,ee2)->ee.getName().compareTo(ee2.getName())).collect(Collectors.toList()).forEach(System.out::println);
	}
}
