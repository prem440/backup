package com.te.SpringCoreAnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//priority
@Primary
public class Disp implements Display {

	@Override
	public void display() {
		System.out.println("refresh rate of dispaly is 240hz");
		
		
	}

	@Override
	public String toString() {
		return "refresh rate of dispaly is 240hz";
	}
	

}
