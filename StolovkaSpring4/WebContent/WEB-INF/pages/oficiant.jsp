<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Oficiant page</title>
<style type="text/css">
body {
	font: 100%/1.4 Verdana, Arial, Helvetica, sans-serif;
	background: #42413C;
	margin: 0;
	padding: 0;
	color: #000;
	font-size:12px;
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
	color: #42413C;
	text-decoration: underline;
}
a:visited {
	color: #6E6C64;
	text-decoration: underline;
}
a:hover, a:active, a:focus {
	text-decoration: none;
}
.container {
	width: 960px;
	background: #FFFFFF;
	margin: 0 auto; 
}
.header {
	background: #ADB96E;
	padding-left: 55px;
	font-size:24px;
	padding-bottom:0;
}
.sidebar1 {
	float: left;
	width: 180px;
	background: #EADCAE;
	padding-bottom:0;
}
.content {
	padding: 10px 0;
	width: 600px;
	float: left;
}
.sidebar2 {
	float: left;
	width: 175px;
	background: #EADCAE;
	padding:0;
}
.chat {
	float: left;
	width: 170px;
	background: #EEE9E9;
	height:250px;
	text-align:right;
	overflow-y: scroll;
}
.content ul, .content ol { 
	padding: 0 15px 15px 40px; 
}

ul.nav {
	list-style: none;
	border-top: 1px solid #666; 
	margin-bottom: 15px;
}
ul.nav li {
	border-bottom: 1px solid #666;
}
ul.nav a, ul.nav a:visited {
	padding: 5px 5px 5px 15px;
	display: block;
	width: 160px;
	text-decoration: none;
	background: #C6D580;
}
ul.nav a:hover, ul.nav a:active, ul.nav a:focus {
	background: #ADB96E;
	color: #FFF;
}
.footer {
	padding: 10px 0;
	background: #CCC49F;
	position: relative;
	clear: both;
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
<div class="header">
  		<jsp:include page="HederOficiant.jsp" />
  	</div>
  <div class="sidebar1">    
    <p> Можно забрать</p>
     <jsp:include page="posmotretChtoPrislalPovar.jsp" />
    </div>
    
  <div class="content">
  
<jsp:include page="polnoeMenuOficiant.jsp" />

  </div>
  <div class="sidebar2">
  <h4>Чат с поваром</h4>
    
    <jsp:include page="chatOficiantPovar.jsp" />
   
    <p></p>
    <br>
    <h4>Чат с админом</h4>
    
   <jsp:include page="chatOficiantAdmin.jsp" />
    
    <p></p>
    <br>
  </div>
  <div class="footer">
    <jsp:include page="FooterOficiant.jsp" />
 </div>
 </div>
</body>
</html>