
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1 align="center">LOVE CALCULATOR</h1>
<hr>
<form:form action="registration-success" method="GET" modelAttribute="userReg">
<p align="right">
<a href="/Homepage" > signin </a>
</p>
<div align="center">
<p>
<label for="n"> Name:</label>
<form:input   id="n" path="name"/>
</p>

<p>
<label for="un"> User Name:</label>
<form:input   id="un" path="uname"/>
</p>
<p>
<label for="pwd"> Password:</label>
<form:password id="pwd" path="pass"/>
</p>
<p>
        <label>Country: </label>
        <form:select path="country">  
        <form:option value="India" label="India"/>  
        <form:option value="USA" label="USA"/>  
        <form:option value="Canada" label="Canada"/>  
        <form:option value="Malvdies" label="Malvdies"/>  
        </form:select> 
</p>

<p>
 <label>Hobby: </label>
        cricket<form:checkbox path="hobby" value="cricket"/>  
        reading<form:checkbox path="hobby" value="reading"/>  
        travel<form:checkbox path="hobby" value="travel"/> 
        programming<form:checkbox path="hobby" value="programming"/>    
</p>
<p>
Male <form:radiobutton path="gender" value="Male"/>  
Female <form:radiobutton path="gender" value="Female"/>  
</p> 
<p>
<input type="submit" value="Register">
</p>
</div>
</form:form>

</body>
</html>