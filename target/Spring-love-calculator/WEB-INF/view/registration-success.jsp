<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>userReg-Data</title>
</head>
<body>

<h1>Your Registration is successful</h1>
<h2>Details entered by you are::</h2>
Name:${userReg.name}<br/>
User Name:${userReg.uname}<br/>
Password:${userReg.pass}<br/>
Country:${userReg.country}<br/>
Hobbies:

<c:forEach var="temp" items="${userReg.hobby}">

${temp}
</c:forEach>
<br/>



Gender:${userReg.gender}<br/>


</body>
</html>