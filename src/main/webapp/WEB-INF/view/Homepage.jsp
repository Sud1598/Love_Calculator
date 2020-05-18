<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>homepage</title>

<style type="text/css">

.error{
color: red;
position: fixed;
text-align:left;
margin-left:2;

}


</style>

<script type="text/javascript">

function validation(){
	
	var userName=document.getElementById("yn").value;
	
	if (userName.length<2 || userName.length>10) {
		
		alert("your Name should have atleast 2 gchar and max 10 char Client side");
		return false;
	}
	else {

		return true; 
	}
}


</script>
</head>



<body>
<h1 align="center">LOVE CALCULATOR</h1>
<hr>
<form:form action="process-homepage" method="get" modelAttribute="userinfo" >

<div align="center">
<p>
<label for="yn"> Your Name:</label>
<form:input   id="yn" path="username"/>
<form:errors path="username" cssClass="error"/>
</p>

<p>
<label for="cn"> Crush Name:</label>
<form:input   id="cn" path="crushname"/>
<form:errors path="crushname" cssClass="error"/>
</p>
<p>

<form:checkbox   path="termAndConditionAccepted"/>
<label> I Am Accepting that this is for Fun purpose</label>
<form:errors path="termAndConditionAccepted" cssClass="error"/>
</p>

<p>
<input type="submit" value="Calculate">
</p>
</div>
</form:form>
</body>

</html>