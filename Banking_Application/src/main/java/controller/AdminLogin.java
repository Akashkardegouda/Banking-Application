package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BankDao;

@WebServlet("/adminlogin")
public class AdminLogin extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		if(email.equals("admin") && password.equals("admin"))
		{
			resp.getWriter().print("<h1>Login Success</h1>");
			
			BankDao bankDao=new BankDao();
			
			req.setAttribute("list", bankDao.fetchAll());
			req.getRequestDispatcher("adminhome.jsp").include(req, resp);
		}
		else
		{
			resp.getWriter().print("<h1>Invalid Credentials</h1>");
			req.getRequestDispatcher("adminlogin.html").include(req, resp);
		}
	}

}
