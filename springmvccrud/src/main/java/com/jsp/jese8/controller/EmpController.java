package com.jsp.jese8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.jese8.dao.EmpDao;
import com.jsp.jese8.dto.EmpDto;

@Controller
public class EmpController {

	@Autowired
	EmpDto emp;
	@Autowired
	EmpDao dao;
	
	@RequestMapping("/signup")
	public ModelAndView signup()
	{
		ModelAndView modelAndView=new ModelAndView("signup.jsp");
//		EmpDto emp=new EmpDto();
		modelAndView.addObject("empobject", emp);
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping("/insert")
	public String savedata(EmpDto recobj)
	{
		//ModelAndView modelAndView=new ModelAndView();
//		EmpDao dao=new EmpDao();
		dao.insert(recobj);
		return "data saved";
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete()
	{
		ModelAndView modelAndView=new ModelAndView("delete.jsp");
		modelAndView.addObject("key1", emp);
		return modelAndView;
	}
	
	@RequestMapping("/remove")
	public String deleted(String email)
	{
		dao.delete(email);
		return "deleted succesfully";
	}
	
	@RequestMapping("/update")
	public ModelAndView update()
	{
		ModelAndView modelAndView=new ModelAndView("update.jsp");
		modelAndView.addObject("key2", emp);
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping("/updated")
	public String updated(String email,String name)
	{
		dao.find(email,name);
		return "updated";
	}
	
	@RequestMapping("/fetch")
	public ModelAndView fetch()
	{
		ModelAndView modelAndView=new ModelAndView("fetch.jsp");
		modelAndView.addObject("key3", emp);
		return modelAndView;
	}
	
	@RequestMapping("/display")
	public ModelAndView fetched(EmpDto e)
	{
		EmpDto d=dao.fetch(e.getEmail());
		ModelAndView modelAndView=new ModelAndView("display.jsp");
		modelAndView.addObject("key4", d);
		return modelAndView;
	}
	
	@RequestMapping("/fetchall")
	public List<EmpDto> fetchAll()
	{
		List<EmpDto>dto=dao.fetchAll();
		ModelAndView modelAndView=new ModelAndView("fetchall.jsp");
		modelAndView.addObject("key5", dto);
		return dto;
	}
	
}
