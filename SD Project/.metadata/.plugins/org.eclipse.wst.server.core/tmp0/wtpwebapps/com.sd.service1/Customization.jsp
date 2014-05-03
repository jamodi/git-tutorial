

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Personalized Desktop</title>
</head>
<body>
<%
String service1=(String) request
.getAttribute("Service1");
String service2=(String) request
.getAttribute("Service2");
String service3=(String) request
.getAttribute("Service3");
String service4=(String) request
.getAttribute("Service4");
String color1=(String) request
.getAttribute("colorMenu1");
String color2=(String) request
.getAttribute("colorMenu2");
String color3=(String) request
.getAttribute("colorMenu3");
String color4=(String) request
.getAttribute("colorMenu4");

pageContext.setAttribute("serv1", service1);
pageContext.setAttribute("serv2", service2);
pageContext.setAttribute("serv3", service3);
pageContext.setAttribute("serv4", service4);
pageContext.setAttribute("colorMenu1", color1);
pageContext.setAttribute("colorMenu2", color2);
pageContext.setAttribute("colorMenu3", color3);
pageContext.setAttribute("colorMenu4", color4);

%>
	<form name=TemperatureConversion method="POST"
		action="/com.sd.service1/workflow.jsp">
		<br> <input type="submit" value="Back"><br>
	</form>
	<form name=TemperatureConversion method="POST"
		action="/com.sd.service1/saveService.jsp">
		<input type="hidden" name="tenantid" value="${param.tenantid}">
	
		<input type="hidden" name="id1" value="${serv1}"> <input
			type="hidden" name="id2" value="${serv2}"> <input
			type="hidden" name="id3" value="${serv3}"> <input
			type="hidden" name="id4" value="${serv4}"> 
			 <input type="hidden"
			name="color1" value="${colorMenu1}"> <input
			type="hidden" name="color2" value="${colorMenu2}"> <input
			type="hidden" name="color3" value="${colorMenu3}"> <input
			type="hidden" name="color4" value="${colorMenu4}"> 
		<input type="submit" value="Save"><br>
	</form>
	<c:set var="service1" scope="session" value="${serv1}" />
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

	<c:set var="service2" scope="session" value="${serv2}" />
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

	<c:set var="service3" scope="session" value="${serv3}" />
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

	<c:set var="service4" scope="session" value="${serv4}" />
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

	<iframe style="background-color: ${colorMenu1};" src="${src1}"
		height="300" width="500" align="left"></iframe>
	<iframe style="background-color: ${colorMenu2};" src="${src2}"
		height="300" width="500" align="left"></iframe>
	<iframe style="background-color: ${colorMenu3};" src="${src3}"
		height="300" width="500" align="left"></iframe>
	<iframe style="background-color: ${colorMenu4};" src="${src4}"
		height="300" width="500" align="left"></iframe>



</body>
</html>