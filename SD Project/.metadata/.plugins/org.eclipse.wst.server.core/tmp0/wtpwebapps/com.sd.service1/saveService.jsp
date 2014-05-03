<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save Services</title>
<style>
#header {
	text-align: center;
	padding: 10px 0 10px 0;
	height: 130px;
	background: #990000;
}

#header_text {
	color: black;
	border: none;
	font-size: 35px;
}

#footer {
	padding: 5px 25px 5px 5px;
	text-align: right;
	background: #990000;
}

#footer_text {
	color: black;
	border: none;
	font-size: 12px;
}

#content {
	background: #FFCC00;
	padding: 85px 85px 85px 500px;
}
</style>

</head>
<body>
	<%
		String tenantid = (String) session.getAttribute("tenantid");
		pageContext.setAttribute("tenantid", tenantid);
	%>
	<div id="header">
		<img style="background: gold" src="smiley.gif" alt="Smiley face"
			width="63" height="63" border="5">
		<h1 id="header_text">
			<marquee behavior="alternate">Recommendation And
				Customization Engine</marquee>
		</h1>
	</div>
	<div id="content">
		<form name=TemperatureConversion method="GET"
			action="/com.sd.service1/api/query/save">

			<input type="hidden" name="tenantid" value="${tenantid}"> <input
				type="hidden" name="service1" value="${param.id1}"> <input
				type="hidden" name="service2" value="${param.id2}"> <input
				type="hidden" name="service3" value="${param.id3}"> <input
				type="hidden" name="service4" value="${param.id4}"> <input
				type="hidden" name="color1" value="${param.color1}"> <input
				type="hidden" name="color2" value="${param.color2}"> <input
				type="hidden" name="color3" value="${param.color3}"> <input
				type="hidden" name="color4" value="${param.color4}">


			<h2>Are you sure you want to save services:</h2>
			<b><c:out value="${param.id1} ">
				</c:out> <c:out value="${param.id2} ">
				</c:out> <c:out value="${param.id3} ">
				</c:out> <c:out value="${param.id4} ?">
				</c:out></b> <br>
			<br> <input type="submit" value="Yes"><br>
		</form>
	</div>
	<div id="footer">
		<h3 align="left">
			<a href="Service.jsp">Click here to publish your awesome
				services?!</a>
		</h3>
		<h2 align="right">
			<u>Creators</u>
		</h2>
		<h2 id="footer_text">@Group 11</h2>
		<h2 id="footer_text">@Group 18</h2>
	</div>
</body>
</html>