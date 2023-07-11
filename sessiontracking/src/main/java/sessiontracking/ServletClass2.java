package sessiontracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet2")
public class ServletClass2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		
		//String s=req.getParameter("username");
//		System.out.println(s);
//		String s2=(String) req.getSession().getAttribute("name");
		Cookie[] c=req.getCookies();
//		System.out.println(s2);
//		resp.getWriter().print(s2);
		for(Cookie c1:c)
		{
			String s=c1.getValue();
			System.out.println(s);
			resp.getWriter().print(s);
		}
		
	}

}
