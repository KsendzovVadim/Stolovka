<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<c:url value="/controllerOficiant/otpravitZakazPovaru/" var="varOtpravitZakazPovaru"></c:url>
<form action="${varOtpravitZakazPovaru}" method="GET">
   <p><label for="nzakaz">Номер заказа :</label>
		<input type="text" name="nzakaz" id="nzakaz" />
   </p>
   <p><label for="nstolik">Номер столика :</label>
		<input type="text" name="nstolik" id="nstolik" />
   </p>
<table border="1" cellspacing="1">
<c:forEach var="varVivestiPolnoeMenu" items="${vivestiPolnoeMenu}">
      <tr>
        <td>${varVivestiPolnoeMenu.bludoName}</td>
        <td>${varVivestiPolnoeMenu.price}</td>
        <td>${varVivestiPolnoeMenu.kartinka}</td>
        <td><input type="text" name="${varVivestiPolnoeMenu.bludoName}" id="${varVivestiPolnoeMenu.bludoName}"></td>
        <td><button type="submit" name="send" value="${varVivestiPolnoeMenu.bludoName}">Отправить</button></td>
<%--         <td><input type="submit" name="${varVivestiPolnoeMenu.bludoName}" id="${varVivestiPolnoeMenu.bludoName}" value="Отправить ${varVivestiPolnoeMenu.bludoName}"></td> --%>
      </tr>
      
      
 
</c:forEach>      
    </table>
        <p>
      
    </p>
    </form>
</body>
</html>