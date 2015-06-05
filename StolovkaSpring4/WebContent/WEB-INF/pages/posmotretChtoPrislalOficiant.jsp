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
  <c:forEach var="varPosmotretChtoPrislalOficiant" items="${posmotretChtoPrislalOficiant}">
  <form action="\HW_3\NewServlet" method="GET">
    <table border="1" cellspacing="1">
    
      <tr>
        <td>Заказ: </td>
        <td>${varPosmotretChtoPrislalOficiant.operOficiantPovarZakaz}</td>
      </tr>
      <tr>
        <td>Столик: </td>
        <td>${varPosmotretChtoPrislalOficiant.operOficiantPovarStolik}</td>
      </tr>
      <tr>
        <td>Блюдо: </td>
        <td>${varPosmotretChtoPrislalOficiant.operOficiantPovarBludoName}</td>
      </tr>
      <tr>
        <td>Количество: </td>
        <td>${varPosmotretChtoPrislalOficiant.operOficiantPovarKolichestvo}</td>
      </tr>
      </table>
       <p>
      
      <c:url value="/controllerPovar/otpravitOficiantuZakaz/${varPosmotretChtoPrislalOficiant.id }" var="varОtpravitOficiantuZakaz"></c:url>
      	<a href="${varОtpravitOficiantuZakaz}">Отдать!</a>
      </form>
      </c:forEach>

</body>
</html>