package crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import dao.ProductDao;
import dto.ProductDto;
@Controller
public class ProductContoller {
	@Autowired
	ProductDto dto;
	@Autowired
	ProductDao dao;
	
	@RequestMapping("/url")
	public ModelAndView insert()
	{
		ModelAndView modelAndView=new ModelAndView("insert.jsp");
		modelAndView.addObject("key", dto);
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/add")
	public String savedata(ProductDto recobject)
	{
		dao.insert(recobject);
		return "data saved";
	}
	
	@RequestMapping("/update")
	public ModelAndView update()
	{
		ModelAndView modelAndView=new ModelAndView("update.jsp");
		modelAndView.addObject("key1", dto);
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping("/updated")
	public String updated(int pid,String pname)
	{
		dao.find(pid,pname);
		return "updated successfully";
	}
	@RequestMapping("/delete")
	public ModelAndView delete()
	{
		ModelAndView modelAndView=new ModelAndView("delete.jsp");
		modelAndView.addObject("key2",dto);
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping("/remove")
	public String deleted(int pid)
	{
		dao.delete(pid);
		return "deleted successfully";
	}
	
	@RequestMapping("/fetch")
	public ModelAndView fetch()
	{
		ModelAndView modelAndView=new ModelAndView("fetch.jsp");
		modelAndView.addObject("key3",dto);
		return modelAndView;
	}
	
	@RequestMapping("/display")
	public ModelAndView fetched(ProductDto p)
	{
		ProductDto d=dao.fetch(p.getPid());
		ModelAndView modelAndView=new ModelAndView("display.jsp");
		modelAndView.addObject("key4", d);
		return modelAndView;
	}
	
	
	@RequestMapping("/fetchall")
	public ModelAndView fetchAll()
	{
		List<ProductDto> dto=dao.fetchall();
		ModelAndView modelAndView=new ModelAndView("fetchall.jsp");
		modelAndView.addObject("key5", dto);
		return modelAndView;
	}
	
	
	
	

}
