package spring_ioc_annotations2;

import org.springframework.stereotype.Component;

@Component
public class DairyMilk implements Chocalate {
	
	public void open()
	{
		System.out.println("Dairy milk chocalate opened");
	}

}
