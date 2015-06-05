<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="chat">
<c:forEach var="varChatAdminPovar" items="${vivestiChatAdminPovar}">
<p>${varChatAdminPovar.chatAdminPovarSotrudnik} : ${varChatAdminPovar.chatAdminPovarText}</p>
<p></p>

</c:forEach>
<c:url value="/ControllerPovar/otpravitSoobshenieAdminu/" var="varOtpravitSoobshenieAdminu"></c:url>
</div>
     <form action="${varOtpravitSoobshenieAdminu}" method="GET">
		<textarea rows="4" cols="26" id="ocomment" name="ocomment"></textarea>
        <br>
        <input type="submit" name="ofText" id="ofText" value="Отправить">
	
    </form>
</body>
</html>