package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Userdao;
import dto.Userdto;
@WebServlet("/login")
public class Login extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		Userdao dao=new Userdao();
		Userdto e=dao.fetch(username);
		
		if(e!=null)
		{
			if(e.getPassword().equals(password))
			{
				resp.getWriter().print("login successful");
			}
			else
			{
				resp.getWriter().print("Incorrect password");
			}
		}
		else
		{
			resp.getWriter().print("data not found");
		}
	}

}
