<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <form:form action="pikaa/zipcode" method="post" modelAttribute="zip">
<fieldset>
<legend>START A CAR RESERVATION</legend>
<table>
	<tr>
	<td style="color: white">	ZIPCODE:</td> <td><form:input path="zipcode"/></td>
		<form:errors path="zipcode" cssStyle="color:red"></form:errors>
	
	</tr>

<tr>
	<td style="color: white">	RENTER AGE:</td> <td><form:input path="renterAge" /></td>
		<form:errors path="renterAge" cssStyle="color:red"></form:errors>
	
	</tr>
	
<tr>
	<td style="color: white">	PICK-UP:</td> <td><form:input path="pickDateMonth" size="2" value="mm"/><form:input path="pickDateDay" size="2" value="dd"/><form:input path="pickDateYear" size="4" value="yyyy"/></td>
		<form:errors path="pickDateMonth" cssStyle="color:red"></form:errors><form:errors path="pickDateDay" cssStyle="color:red"></form:errors><form:errors path="pickDateYear" cssStyle="color:red"></form:errors>
	
	</tr>
	
	<tr>
	<td style="color: white">	RETURN:</td> <td><form:input path="returnDateMonth" size="2" value="mm"/><form:input path="returnDateDay" size="2" value="dd"/><form:input path="returnDateYear" size="4" value="yyyy"/></td>
		<form:errors path="returnDateMonth" cssStyle="color:red"></form:errors><form:errors path="returnDateDay" cssStyle="color:red"></form:errors><form:errors path="returnDateYear" cssStyle="color:red"></form:errors>
	
	</tr>
<tr>

<td colspan="2">
		
	<input type="submit" value="submit"/>
	</td>
</tr>
	
	</table>
	</fieldset>
	
</form:form> 
</body>
</html>