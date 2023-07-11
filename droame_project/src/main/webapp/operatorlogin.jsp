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
<form:form action="validate" modelAttribute="opobject">
Operator id<form:input path="operator_id"/><br>
Operator password<form:input path="operator_pwd"/><br>
<form:button>LOGIN</form:button>
</form:form>
</body>
</html>