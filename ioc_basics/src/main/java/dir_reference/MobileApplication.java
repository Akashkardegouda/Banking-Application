package dir_reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileApplication {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("dir.xml");
		Mobile mobile=(Mobile) applicationContext.getBean("mymobile");
		System.out.println(mobile);
		
		
	}

}
