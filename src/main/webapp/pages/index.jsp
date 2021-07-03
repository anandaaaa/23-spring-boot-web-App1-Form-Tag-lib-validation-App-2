<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> USER LOGIN</h3>

<form:form action="/saveUser" modelAttribute="user" method="POST">
<table>
<tr>
<td>user name</td>
<td><form:input path="userName"/></td>
</tr>
<tr>
<td>password</td>
<td><form:password path="pass"/></td>
</tr>
<tr>
<td>Email</td>
<td><form:input path="email"/></td>
</tr>
<tr>
<td>Phone no:</td>
<td><form:input path="phno"/></td>
</tr>
<tr>
<td><input type="submit" value="save"/></td>
</tr>
</table>


</form:form>

</body>
</html>