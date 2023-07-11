package spring_ioc_annotations2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class KitKat implements Chocalate {
	
	public void open()
	{
		System.out.println("Kitkat chocalate opened ");
	}

}
