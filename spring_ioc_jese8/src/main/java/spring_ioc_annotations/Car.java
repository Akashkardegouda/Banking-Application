package spring_ioc_annotations;

import org.springframework.stereotype.Component;

@Component
public class Car {
	void engine()
	{
		System.out.println("engine is started");
	}

}
