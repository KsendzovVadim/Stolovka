<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="varPosmotretChtoPrislalPovar" items="${posmotretChtoPrislalPovar}">
  <form action="\HW_3\NewServlet" method="POST">
    <table border="1" cellspacing="1">
    
      <tr>
        <td>Заказ: </td>
        <td>${varPosmotretChtoPrislalPovar.operPovarOficiantZakaz}</td>
      </tr>
      <tr>
        <td>Столик: </td>
        <td>${varPosmotretChtoPrislalPovar.operPovarOficiantStolik}</td>
      </tr>
      <tr>
        <td>Блюдо: </td>
        <td>${varPosmotretChtoPrislalPovar.operPovarOficiantBludoName}</td>
      </tr>
      <tr>
        <td>Количество: </td>
        <td>${varPosmotretChtoPrislalPovar.operPovarOficiantKolichestvo}</td>
      </tr>
      </table>
       <p>
      
      <c:url value="/controllerOficiant/zabratUPovaraZakaz/${varPosmotretChtoPrislalPovar.id }" var="varZabratUPovaraZakaz"></c:url>
      	<a href="${varZabratUPovaraZakaz}">Забрать!</a>
      </form>
      <hr>
      </c:forEach>
</body>
</html>