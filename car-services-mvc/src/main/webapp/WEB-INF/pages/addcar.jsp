<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Car</title>
</head>
<body>

<p>RowAdded</p><c:out value="${rowAdded}"/>

<form:form method="post" action="cars">


<form:label path="dist">Car dist</form:label>
<form:input path="dist"/>


<form:label path="brand">Car brand</form:label>
<form:input path="brand"/>


<form:label path="model">Car model</form:label>
<form:input path="model"/>

<input type="submit" value="Add">

</form:form>

</body>
</html>