<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
body {
	font: 100%/1.4 Verdana, Arial, Helvetica, sans-serif;
	background: #4E5869;
	margin: 0;
	padding: 0;
	color: #000;
}
ul, ol, dl {
	padding: 0;
	margin: 0;
}
h1, h2, h3, h4, h5, h6, p {
	margin-top: 0;
	padding-right: 15px;
	padding-left: 15px;
}
a img {
	border: none;
}
a:link {
	color:#414958;
	text-decoration: underline;
}
a:visited {
	color: #4E5869;
	text-decoration: underline;
}
a:hover, a:active, a:focus {
	text-decoration: none;
}
.container {
	width: 80%;
	max-width: 1260px;
	min-width: 780px;
	background: #FFF;
	margin: 0 auto;
}
.content {
	padding: 10px 0;
	text-align:center;
}
.form {
	position:relative;
	background-color:#096;
	width: 200px;
	height: 120px;
	border: 3px;
	border-color:#F90;
	padding: 10px;
	margin:0 auto;
	
	}
.content ul, .content ol { 
	padding: 0 15px 15px 40px;
}
.fltrt {
	float: right;
	margin-left: 8px;
}
.fltlft {
	float: left;
	margin-right: 8px;
}
.clearfloat {
	clear:both;
	height:0;
	font-size: 1px;
	line-height: 0px;
}
</style>
</head>

<body>

<div class="container">
  <div class="content">
    <h1>Кто к нам пожаловал?))</h1>
    <p>&nbsp;</p>
    
    <div class="form">
    <c:url value="/controllerLogin/sravnitSBDPoslatNaJSP/" var="varSravnitSBDPoslatNaJSP"></c:url>
    <form action="${varSravnitSBDPoslatNaJSP}" method="GET">
    <p><input type="text" name="login" id="login" /></p>
    
    <p><input type="text" name="pass" id="pass" /></p>
    
     <p><input type="submit" name="ofotpavmenu" id="ofotpavmenu" value="Отправить"></p>
    </form></div>
    <!-- end .content --></div>
  <!-- end .container --></div>
</body>
</html>