package com.te.collection.custe;

import com.te.threads.main;

public class ravi extends b {

	ravi(String d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	static void validate(int age)throws ravi{
		if(age<18) {
			throw new ravi("age is not obtain to do operation ");
			
		}
		else
		{
			System.out.println("ok bro");
		}
}
	public static void main(String[] args) {
		try {
			validate(12);
		} catch (ravi e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
