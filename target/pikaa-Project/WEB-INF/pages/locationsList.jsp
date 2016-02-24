<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<title>Insert title here</title>

<c:set var="url" value="${pageContext.request.contextPath}"></c:set>
</head>
<body>

<div class="container">
           
  <table class="table table-hover">
    <thead>
      <tr style="color: red">
        <th>Location Name</th>
        <th>City</th>
        <th>State</th>
        <th>ZipCode</th>
      </tr>
    </thead>
    <tbody>
    
    <c:forEach var="locList" items="${topList}">
      <tr style="color: white">
        <td>${locList.locName}</td>
        <td>${locList.locCity}</td>
        <td>${locList.locState}</td>
        <td>${locList.locZipcode}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>


</body>
</html>