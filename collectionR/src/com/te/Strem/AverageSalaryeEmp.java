package com.te.Strem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.te.collection.Arraylist.Employee;

public class AverageSalaryeEmp {
	public static void main(String[] args) {
		List<Employee> AsList = Arrays.asList(new Employee(1, "triple h", 99999.5),
				new Employee(2, "randi orton", 499899), new Employee(3, "brock lesnor", 563899),new Employee(4, "john sena",7676767));
//sorted
	AsList.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName())).collect(Collectors.toList()).forEach(System.out::println);
	//
}
}