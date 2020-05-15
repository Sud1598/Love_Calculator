<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>homepage</title>

<script type="text/javascript">

function validation(){
	
	var userName=document.geElementById("yn").value;
	
	if (userName.length<1) {
		
		alert("your Name should have atleast 1 char");
		return false;
	} else {

		return true; 
	}
}


</script>
</head>



<body>
<h1 align="center">LOVE CALCULATOR</h1>
<hr>
<form:form action="process-homepage" method="get" modelAttribute="userinfo">

<div align="center">
<p>
<label for="yn"> Your Name:</label>
<form:input   id="yn" path="username"/>
<form:errors path="username"/>
</p>

<p>
<label for="cn"> Crush Name:</label>
<form:input   id="cn" path="crushname"/>
</p>

<p>
<input type="submit" value="Calculate">
</p>
</div>
</form:form>
</body>

</html>