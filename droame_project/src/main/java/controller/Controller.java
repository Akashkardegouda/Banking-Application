package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import dao.Dao;
import dto.Customer;
import dto.Operator;


@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	Customer customer;
	
	@Autowired
	Operator operator;
	
	@Autowired
	Dao dao;
	
	@RequestMapping("/url")
	public ModelAndView createOperator()
	{
		ModelAndView modelAndView=new ModelAndView("operator.jsp");
		modelAndView.addObject("key", operator);
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping("/operator")
	public String insertOperator(Operator recoper)
	{
		dao.addOperator(recoper);
		return "operator details added successfully";
	}
	

	@RequestMapping("/login")
	public ModelAndView operatorlogin()
	{
		ModelAndView modelAndView=new ModelAndView("operatorlogin.jsp");
		modelAndView.addObject("opobject",operator);
		return modelAndView;
	}
	
	@RequestMapping("/validate")
	public ModelAndView validate(Operator operator_pwd)
	{
		Operator operator2=dao.findop(operator_pwd.getOperator_id());
		if(operator2.getOperator_pwd().equals(operator_pwd.getOperator_pwd()))
		{
			ModelAndView modelAndView=new ModelAndView("customer.jsp");
			modelAndView.addObject("key1", customer);
			return modelAndView;
		}
		else
		{
			System.out.println("Invalid Password");
		}
		return null;
		
	}
	
	@ResponseBody
	@RequestMapping("/customer")
	public String insertCustomer(Customer recobj)
	{
		dao.addCustomer(recobj);
		return "customer details added successfully";
	}
	

}
