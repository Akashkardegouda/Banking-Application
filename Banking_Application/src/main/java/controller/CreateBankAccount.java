package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BankDao;
import dao.CustomerDao;
import dto.BankAccount;
import dto.Customer;
@WebServlet("/createbankaccount")
public class CreateBankAccount extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
		String banktype=req.getParameter("banktype");
		
		Customer customer=(Customer) req.getSession().getAttribute("customer");
		
		List<BankAccount> list=customer.getAccounts();
		boolean flag=true;
		
		for(BankAccount account:list) {
			if(account.getType().equals(banktype)) {
				flag=false;
				break;
			}
		}
		
		if(flag)
		{
			BankAccount account=new BankAccount();
			account.setType(banktype);
			
			if(banktype.equals("saving"))
			{
				account.setAclimit(10000);
			}
			else
			{
				account.setAclimit(50000);
			}
			
			account.setCustomer(customer);
			
			BankDao bankDao=new BankDao();
			bankDao.save(account);
			
			list.add(account);
			customer.setAccounts(list);
			
			CustomerDao customerDao=new CustomerDao();
			customerDao.update(customer);
			
			resp.getWriter().print("<h1>Account created successfully wait for management to approve your account</h1>");
			req.getRequestDispatcher("login.html").include(req, resp);
		}
		else
		{
			resp.getWriter().print("<h1>" +banktype+ "Account already exists</h1>");
			req.getRequestDispatcher("customerhome.html").include(req, resp);
		}
		
	}

}
