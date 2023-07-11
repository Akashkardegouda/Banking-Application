package servlet_login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
@WebServlet("/login")
public class Login extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		if(username.equals("akash") && password.equals("akash123"))
		{
			HttpSession session=req.getSession();
			session.setAttribute("username", username);
			resp.sendRedirect("welcome.jsp");
		}
		else
		{
			resp.sendRedirect("login.jsp");
		}
		
	}

}
