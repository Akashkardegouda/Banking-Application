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
     <table border="1px">
         <tr>
         <th>pid</th>
         <th>pname</th>
         <th>brand</th>
         </tr>
         
         <%
               ProductDto data=(ProductDto)request.getAttribute("key4");
         %>
         <tr>
         <td><%=data.getPid() %></td>
         <td><%=data.getPname() %></td>
         <td><%=data.getBrand() %></td>
         </tr>
             
     
     
     
     </table>
</body>
</html>