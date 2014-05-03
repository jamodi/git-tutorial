<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Personalized desktop</title>
</head>
<body>


	<c:set var="service1" scope="session" value="${param.temp1}" />
	<c:choose>
		<c:when test="${service1 == 1}">
			<c:set var="src1" scope="session"
				value="http://localhost:8080/com.sd.service1/AddCelsius.jsp" />
		</c:when>
		<c:when test="${service1 == 2}">
			<c:set var="src1" scope="session"
				value="http://localhost:8080/com.sd.service1/AddFahrenheit.jsp" />
		</c:when>
		<c:when test="${service1 == 3}">
			<c:set var="src1" scope="session"
				value="http://localhost:8080/com.sd.service1/bmi.jsp" />
		</c:when>
		<c:when test="${service1 == 4}">
			<c:set var="src1" scope="session"
				value="http://localhost:8080/com.sd.service1/Date&Time.jsp" />
		</c:when>
		<c:when test="${service1 == 5}">
			<c:set var="src1" scope="session"
				value="http://localhost:8080/com.sd.service1/Calculator.jsp" />
		</c:when>
		<c:otherwise>
			<c:set var="src1" scope="session"
				value="http://localhost:8080/com.sd.service1/Blank.html" />
		</c:otherwise>
	</c:choose>

	<c:set var="service2" scope="session" value="${param.temp2}" />
	<c:choose>
		<c:when test="${service2 == 1}">
			<c:set var="src2" scope="session"
				value="http://localhost:8080/com.sd.service1/AddCelsius.jsp" />
		</c:when>
		<c:when test="${service2 == 2}">
			<c:set var="src2" scope="session"
				value="http://localhost:8080/com.sd.service1/AddFahrenheit.jsp" />
		</c:when>
		<c:when test="${service2 == 3}">
			<c:set var="src2" scope="session"
				value="http://localhost:8080/com.sd.service1/bmi.jsp" />
		</c:when>
		<c:when test="${service2 == 4}">
			<c:set var="src2" scope="session"
				value="http://localhost:8080/com.sd.service1/Date&Time.jsp" />
		</c:when>
		<c:when test="${service2 == 5}">
			<c:set var="src2" scope="session"
				value="http://localhost:8080/com.sd.service1/Calculator.jsp" />
		</c:when>
		<c:otherwise>
			<c:set var="src2" scope="session"
				value="http://localhost:8080/com.sd.service1/Blank.html" />
		</c:otherwise>
	</c:choose>

	<c:set var="service3" scope="session" value="${param.temp3}" />
	<c:choose>
		<c:when test="${service3 == 1}">
			<c:set var="src3" scope="session"
				value="http://localhost:8080/com.sd.service1/AddCelsius.jsp" />
		</c:when>
		<c:when test="${service3 == 2}">
			<c:set var="src3" scope="session"
				value="http://localhost:8080/com.sd.service1/AddFahrenheit.jsp" />
		</c:when>
		<c:when test="${service3 == 3}">
			<c:set var="src3" scope="session"
				value="http://localhost:8080/com.sd.service1/bmi.jsp" />
		</c:when>
		<c:when test="${service3 == 4}">
			<c:set var="src3" scope="session"
				value="http://localhost:8080/com.sd.service1/Date&Time.jsp" />
		</c:when>
		<c:when test="${service3 == 5}">
			<c:set var="src3" scope="session"
				value="http://localhost:8080/com.sd.service1/Calculator.jsp" />
		</c:when>
		<c:otherwise>
			<c:set var="src3" scope="session"
				value="http://localhost:8080/com.sd.service1/Blank.html" />
		</c:otherwise>
	</c:choose>

	<c:set var="service4" scope="session" value="${param.temp4}" />
	<c:choose>
		<c:when test="${service4 == 1}">
			<c:set var="src4" scope="session"
				value="http://localhost:8080/com.sd.service1/AddCelsius.jsp" />
		</c:when>
		<c:when test="${service4 == 2}">
			<c:set var="src4" scope="session"
				value="http://localhost:8080/com.sd.service1/AddFahrenheit.jsp" />
		</c:when>
		<c:when test="${service4 == 3}">
			<c:set var="src4" scope="session"
				value="http://localhost:8080/com.sd.service1/bmi.jsp" />
		</c:when>
		<c:when test="${service4 == 4}">
			<c:set var="src4" scope="session"
				value="http://localhost:8080/com.sd.service1/Date&Time.jsp" />
		</c:when>
		<c:when test="${service4 == 5}">
			<c:set var="src4" scope="session"
				value="http://localhost:8080/com.sd.service1/Calculator.jsp" />
		</c:when>
		<c:otherwise>
			<c:set var="src4" scope="session"
				value="http://localhost:8080/com.sd.service1/Blank.html" />
		</c:otherwise>
	</c:choose>

	<iframe style="background-color: ${param.color1};" src="${src1}"
		height="300" width="500" align="left"></iframe>
	<iframe style="background-color: ${param.color2};" src="${src2}"
		height="300" width="500" align="left"></iframe>
	<iframe style="background-color: ${param.color3};" src="${src3}"
		height="300" width="500" align="left"></iframe>
	<iframe style="background-color: ${param.color4};" src="${src4}"
		height="300" width="500" align="left"></iframe>



</body>
</html>