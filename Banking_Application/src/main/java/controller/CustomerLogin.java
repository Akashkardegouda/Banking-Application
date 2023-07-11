package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDao;
import dto.Customer;

@WebServlet("/customerlogin")
public class CustomerLogin extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		int custid=Integer.parseInt(req.getParameter("custid"));
		String password=req.getParameter("password");
		
		CustomerDao dao=new CustomerDao();
		
		Customer customer=dao.login(custid);
		
		if(customer==null)
		{
			resp.getWriter().print("<h1>Invalid Customer Id</h1>");
			req.getRequestDispatcher("login.html").include(req, resp);
		}
		else
		{
			if(customer.getPassword().equals(password))
			{
				req.getSession().setAttribute("customer", customer);
				resp.getWriter().print("<h1>Login Successful</h1>");
				req.getRequestDispatcher("customerhome.html").include(req, resp);
			}
			else
			{
				resp.getWriter().print("<h1>Invalid Password</h1>");
				req.getRequestDispatcher("login.html").include(req, resp);
			}
		}
	}
	

}
