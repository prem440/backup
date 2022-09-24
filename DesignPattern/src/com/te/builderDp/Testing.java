package com.te.builderDp;

import com.te.factoryDP.Demo;

public class Testing {
	public static void main(String[] args) {
		Employee build = Employee.builder().name("ravi").build();
		System.out.println(build);
	
		
	}

}
