package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import dao.ProductDao;
import dto.ProductDto;

@Controller
public class ProductController {
	
	@Autowired
	ProductDto dto;
	
	@Autowired
	ProductDao dao;
	
	@RequestMapping("/insert")
	public ModelAndView insert()
	{
		ModelAndView modelAndView=new ModelAndView("insert.jsp");
		modelAndView.addObject("key1", dto);
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping("/save")
	public String savedata(ProductDto recobj)
	{
		dao.insert(recobj);
		return "data saved successfully";
	}
	
	@RequestMapping("/fetch")
	public ModelAndView fetch()
	{
		ModelAndView modelAndView=new ModelAndView("fetch.jsp");
		modelAndView.addObject("key2", dto);
		return modelAndView;
	}
	
	@RequestMapping("/display")
	public ModelAndView fetched(ProductDto p)
	{
		ProductDto e=dao.fetch(p.getPid());
		ModelAndView modelAndView=new ModelAndView("display.jsp");
		modelAndView.addObject("key3", e);
		return modelAndView;
	}

}
