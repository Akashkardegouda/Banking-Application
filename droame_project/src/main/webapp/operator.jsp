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
<form:form action="operator" modelAttribute="key">
Operator Password<form:input path="operator_pwd" id="1stPassword"/><br>
Confirm Password<form:input path="operator_cpwd" id="ConfirmPassword"/><br>
<form:button onclick="return Validate()">SUBMIT</form:button>
</form:form>

<script>
function Validate() {
	var password=document.getElementById("1stPassword").value;
	var confirmPassword=document.getElementById("ConfirmPassword").value;
	if(password!=confirmPassword){
		alert("password not matching");
		return false;
	}
	return confirmPassword;
}
</script>
</body>
</html>