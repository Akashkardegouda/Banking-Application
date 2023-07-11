package com.jsp.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Baby {
	@Autowired
	Icecream icecream;
	void open() {
		Icecream icecream=new Straberry();
		
		icecream.eating();
		System.out.println("baby started eating");
	}

}
