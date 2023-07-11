package spring_ioc_annotationss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BikeDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig2.class);
		Yamaha bike=applicationContext.getBean(Yamaha.class);
		bike.Buy();
	}

}
