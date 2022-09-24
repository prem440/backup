package com.te.Strem;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.te.collection.Arraylist.Employee;
import com.te.threads.main;

public class Filterforsalry {
	public static void main(String[] args) {
		List<Employee>aslist =Arrays.asList(new Employee(1, "ravi", 49870),new Employee(2, "john",57999),new Employee(3, "komal", 78990));
		Predicate<Employee> p=(e)->{
			if(e.getSalary()>49000) {
				return true;
			}
			else
			{
				return false;
			}
			
		};
		List<Employee> collect = aslist.stream().filter(p).collect(Collectors.toList());
	for (Iterator iterator = collect.iterator(); iterator.hasNext();) {
		Employee employee = (Employee) iterator.next();
		System.out.println(employee);
	}
	}

}
