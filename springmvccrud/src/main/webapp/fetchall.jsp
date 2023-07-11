<%@page import="com.jsp.jese8.dto.EmpDto"%>
<%@page import="java.util.List"%>
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
         
         <%List<EmpDto>dto=(List<EmpDto>)request.getAttribute("key5"); %>
         
         <%for(EmpDto e1:dto){ %>
           <tr>
           <td><%=e1.getEmail() %></td>
           <td><%=e1.getPwd() %></td>
           <td><%=e1.getName() %></td>
           <td><%=e1.getPhone() %></td>
           <td><%=e1.getRole() %></td>
           
           
           <%} %>
           
           </tr>
    
    </table>
</body>
</html>