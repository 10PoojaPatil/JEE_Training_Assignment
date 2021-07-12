<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Cars</title>
<style type="text/css">

table{
border: 2px solid blue;
border-collapse: collapse;
margin-left: auto;
margin-right: auto;
}
tr,th,td{
border: 2px solid blue;
}

</style>

</head>
<body>

<h3 style="text-align: center;">List of Cars </h3>
<table>
<tr>
 <th>dist</th>
 <th>Car brand</th>
 <th>Car model</th>
 
</tr>
<c:forEach items="${list}" var="eachItem">
<tr>
 <td><c:out value="${eachItem.dist}"/></td>
 <td><c:out value="${eachItem.brand}"/></td>
 <td><c:out value="${eachItem.model}"/></td>
 
</tr>
 </c:forEach>
</table>
</body>
</html>