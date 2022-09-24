package com.te.SpringCoreAnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	@Value("amaron")
	private String name;
	@Value("4500")
	private String Capacity;
	public String getName() {
		return name;
	}
	public String getCapacity() {
		return Capacity;
	}
	public Battery() {
		super();
	}
	
	@Override
	public String toString() {
		return "Battery [name=" + name + ", Capacity=" + Capacity + "]";
	}
	

}
