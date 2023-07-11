<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="updated" modelAttribute="key2">
EMAIL:<form:input path="email"/><br>
NAME:<form:input path="name"/><br>
<form:button>UPDATE</form:button>
</form:form>
</body>
</html>