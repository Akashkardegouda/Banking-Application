package spring_ioc_annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Children {
	
	@Autowired
	Chocalate chocalate;
	public void eating()
	{
		chocalate.open();
	}

}
