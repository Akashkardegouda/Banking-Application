package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductContoller {
	@Autowired
	ProductDto dto;
	@Autowired
	ProductDao dao;
	@RequestMapping("/insert")
	public ModelAndView insert()
	{
		ModelAndView modelAndView=new ModelAndView("insert.jsp");
		modelAndView.addObject("probject", dto);
		return modelAndView;
	}
	
	@RequestMapping("/save")
	public String savedata(ProductDto recobj)
	{
		dao.insert(recobj);
		return "data saved";
	}

}
