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
	<c:set var="url" value="${pageContext.request.contextPath}"></c:set>
<style>
*{
	margin:0px;
	padding:0px;
}

body2{
	font-family: verdana;
	background-color:light blue;
	padding:50px;
	background-image:url('image/people.jpg');

}

h1{
	background-image:url("../images/pik.png");
	background-repeat:no-repeat;
	color:red;
	height:80px;
	padding-top:20px;
	line-height:50px;
	max-width:100%;
	font-size:40px;
	
}

/*rules for menu*/

ul#nav-menu,ul.nav-sub{
	list-style-type:none;
	font-size:12pt;
}

ul#nav-menu li{
	width:130px;
	text-align:center;
	position:relative;
	float:left;
	margin-right:0px;
}

ul#nav-menu a{
	text-decoration:none;
	display:block;
	width:125px;
	height:25px;
	line-height:25px;
	background-color:pink;
	border:1px solid #CCC;
	border-radius:5px;
}
ul#nav-menu .nav-sub li{
	

}
ul#nav-menu .nav-sub a{
	margin-top:2px;
}

ul#nav-menu li:hover > a{
	background-color:red;

}
ul#nav-menu li:hover a:hover{
	background-color:yellow;

}

ul#nav-menu ul.nav-sub{
	display:none;
	position:absolute;
	top:26px;
	left:0px;
}

ul#nav-menu li:hover .nav-sub{
	display:block;


}

.darrow{
	font-size:14pt;
	position:absolute;
	top:1px;
	right:8px;
}


</style>
</head>
<body>
<nav>
	<body2>
	<h1>
	<img src="car.png" height="130px" width="130px"/>
	<h1>Pik..aa</h1>
	</h1>
	<ul id="nav-menu">
		<li><a >Rent</a><span class="darrow">&#9660;</span>
		<ul class="nav-sub">
			<li><a href="${url}/pikaa/zipcode">Rent a Car</a></li>
		</ul>
		</li>
		<li><a href="#">Locations</a><span class="darrow">&#9660;</span>
		<ul class="nav-sub">
			<li><a href="#">Location 1</a></li>
			<li><a href="#">Location 2</a></li>
			<li><a href="#">Location 3</a></li>
			<li><a href="#">Location 4</a></li>
			<li><a href="#">Location 5</a></li>
			<li><a href="#">Location 6</a></li>
			<li><a href="#">Location 7</a></li>
		</ul>
		</li>
		<li><a href="#">About Us</a></li>
		<li><a href="#">Careers</a></li>
	
	<ul style="float:right;list-style-type:none;text-decoration:none">
      <li><a href="#">Sign Up</a>
    </ul>
	</ul>
		
</body2>
	</nav>
</body>
</html>