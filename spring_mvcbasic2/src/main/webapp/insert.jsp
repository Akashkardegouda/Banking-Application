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
<form:form action="save" modelAttribute="probject">
<form:input path="pid"/><br>
<form:input path="name"/><br>
<form:input path="price"/><br>
<form:input path="brand"/><br>
<form:button>SUBMIT</form:button>
</form:form>
</body>
</html>