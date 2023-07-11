<%@page import="dto.ProductDto"%>
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
	<table border="2px">
		<tr>
			<th>pid</th>
			<th>pname</th>
			<th>brand</th>
			<th>HOME PAGE</th>
			
		</tr>
		<%
		List<ProductDto> dto = (List<ProductDto>) request.getAttribute("key5");
		%>
		<%
		for (ProductDto p1 : dto) {
		%>
		<tr>
			<td><%=p1.getPid()%></td>
			<td><%=p1.getPname()%></td>
			<td><%=p1.getBrand()%></td>
			<td><button><a href="Home.jsp">Click Here</a></button></td>
			
			<%
			}
			%>
		</tr>
	</table>
</body>
</html>