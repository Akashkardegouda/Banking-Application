package com.jsp.di;

import org.springframework.stereotype.Component;

@Component
public class Straberry implements Icecream{
	
	public void eating()
	{
		System.out.println("Straberry icecream");
	}

}
