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
<form:form action="customer" modelAttribute="key1">
Customer Email<form:input path="customer_email"/><br>
Customer Name<form:input path="customer_name"/><br>
Customer phNo<form:input path="customer_phno"/><br>
<form:button>SUBMIT</form:button>
</form:form>
</body>
</html>