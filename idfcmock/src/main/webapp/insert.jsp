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
<form:form action="save" modelAttribute="key1">
PId<form:input path="pid"/><br>
PNAME<form:input path="pname"/><br>
PBRAND<form:input path="pbrand"/><br>
<form:button>INSERT</form:button>
</form:form>
</body>
</html>