package spring_ioc_annotationss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Yamaha {
	
	@Autowired
	Bike bike;
	
	void Buy()
	{
		bike.purchase();
	}

}
