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
  
       <table width="593" border="1" cellspacing="1">
  <tr>
    <td width="27">№</td>
    <td width="86">Название</td>
    <td width="47">Цена</td>
    <td width="61">Затраты</td>
    <td width="64">Прибыль</td>
    <td width="51">Кол-во</td>
    <td width="106">Общие затраты</td>
    <td width="102">Общая прибыль</td>
  </tr>
  <c:forEach var="varPosmotretSkvoznuyuStatu" items="${posmotretSkvoznuyuStatu}">
  <tr>
    <td>${varPosmotretSkvoznuyuStatu.id}</td>
    <td>${varPosmotretSkvoznuyuStatu.skvoznayaStataBludoName}</td>
    <td>${varPosmotretSkvoznuyuStatu.skvoznayaStataPrice}</td>
    <td>${varPosmotretSkvoznuyuStatu.skvoznayaStataZatrati}</td>
    <td>${varPosmotretSkvoznuyuStatu.skvoznayaStataPribil}</td>
    <td>${varPosmotretSkvoznuyuStatu.skvoznayaStataKolichestvo}</td>
    <td>${varPosmotretSkvoznuyuStatu.skvoznayaStataObshieZatrati}</td>
    <td>${varPosmotretSkvoznuyuStatu.skvoznayaStataObshayaPribil}</td>
  </tr>
  </c:forEach>
</table>
       <p>
      
</body>
</html>