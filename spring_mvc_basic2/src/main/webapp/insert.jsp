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
<form:form action="add" modelAttribute="key">
pid<form:input path="pid"/><br>
pname<form:input path="pname"/><br>
brand<form:input path="brand"/><br>
<form:button>SUBMIT</form:button>
</form:form>
</body>
</html>