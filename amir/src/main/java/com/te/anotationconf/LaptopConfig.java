package com.te.anotationconf;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LaptopConfig {
	@Bean(autowire = Autowire.BY_NAME)
	public Laptop getlaptop() {
		Laptop l = new Laptop();
		l.setName("paviloun p10");
		l.setPrice(45000);
		l.setProcesor("intel i5");
		l.setRam("12GB");
		return l;
	}

	@Bean(name = "acs")
	
	public Accesories getAccesories() {
		Accesories a = new Accesories();
		a.setQuantity(12);
		a.setTotalprice(1290);
		return a;

	}
@Bean(name = "acs")
	
	public Accesories getAccesoriess() {
		Accesories a = new Accesories();
		a.setQuantity(122);
		a.setTotalprice(91290);
		return a;

}}
