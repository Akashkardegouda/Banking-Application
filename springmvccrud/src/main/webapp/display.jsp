<%@page import="com.jsp.jese8.dto.EmpDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
   <tr>
   <th>email</th>
   <th>pwd</th>
   <th>name</th>
   <th>phone</th>
   <th>role</th>
   </tr>
   
   <%EmpDto data=(EmpDto)request.getAttribute("key4"); %>
   
   <tr>
   <td><%=data.getEmail() %></td>
   <td><%=data.getPwd()  %></td>
   <td><%=data.getName() %></td>
   <td><%=data.getPhone() %></td>
   <td><%=data.getRole() %></td>
   </tr>

</table>
</body>
</html>