<%@page import="dto.ProductDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <table border="2px">
         <tr>
         <th>PID</th>
         <th>PNAME</th>
         <th>PBRAND</th>
         </tr>
         
         <%
             ProductDto data=(ProductDto)request.getAttribute("key3");
         %>
         <tr>
         <td><%=data.getPid() %></td>
         <td><%=data.getPname() %></td>
         <td><%=data.getPbrand() %></td>
         </tr>
             
     
     </table>
</body>
</html>