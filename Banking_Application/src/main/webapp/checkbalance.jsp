<%@page import="dto.BankAccount"%>
<%@page import="dao.BankDao"%>
<%@page import="dto.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Customer customer=(Customer)session.getAttribute("customer");
if(customer==null)
{
	response.getWriter().print("<h1>Session Expired Login Again</h1>");
	request.getRequestDispatcher("login.html").include(request, response);
}
else{
%>
<%
long acno = (long) session.getAttribute("acno");
BankDao bankDao=new BankDao();
BankAccount account=bankDao.find(acno);
Customer customer2=account.getCustomer();
%>

<h1>Hello <%if(customer2.getGender().equals("male")) {%>Mr. <%}else{%>Ms. <%} %> <%=customer2.getName() %></h1>
<h1>Your <%=account.getType() %> account balance is <%=account.getAmount() %></h1>
<br><br>
<a href="accounthome.jsp"><button>Back</button></a>
<%} %>
</body>
</html>