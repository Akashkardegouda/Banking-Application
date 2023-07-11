package basic1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Demo {
	@RequestMapping("/url")
	public ModelAndView hi()
	{
		System.out.println("welcome to spring mvc");
		ModelAndView view=new ModelAndView("abc.jsp");
		return view;
	}
	@RequestMapping("/abc")
	public ModelAndView hey()
	{
		System.out.println("welcome to mvc");
		ModelAndView view=new ModelAndView("abc.jsp");
		return view;
		
	}

}
