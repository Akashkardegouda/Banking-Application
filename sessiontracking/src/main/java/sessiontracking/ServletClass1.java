package sessiontracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet1")
public class ServletClass1 extends HttpServlet{
	
	@Override

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		
         String s1=req.getParameter("username");
//         req.getSession().setAttribute("name", s1);
       Cookie cookie=new Cookie("name", s1);
       resp.addCookie(cookie);
         //System.out.println(s1);
         resp.getWriter().print("<a href=servlet2>servlet2</a>");
	}
	
	

}
