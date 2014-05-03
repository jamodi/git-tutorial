<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*"%>
<%@ page import="java.io.File"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Service</title>
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
	<div id="header">
		<img style="background: gold" src="smiley.gif" alt="Smiley face"
			width="63" height="63" border="5">
		<h1 id="header_text">
			<marquee behavior="alternate">Recommendation And
				Customization Engine</marquee>
		</h1>
	</div>
	<div id="content">

		<form method="post"
			action="<%=request.getContextPath()%>/servicesubmit">

			<div id="domainname">
				Domain Name: <input type="text" name="domain" width="20px"
					class="textbox" style="width: 300px; margin-left: 100px"></input><br>
			</div>
			<br>
			<div id="servicename">
				Service Name: <input type="text" name="servicename" width="20px"
					class="textbox" style="width: 300px; margin-left: 101px"></input><br>
			</div>
			<br>
			<div id="desc">
				Description:<input type="text" name="desc" width="20px"
					class="textbox" style="width: 300px; margin-left: 118px"></input><br>
				 
			</div>
			<br>
			<div id="submit">
				<input type="submit" class="buttons" value="GO!" size="100"
					style="width: 50px; margin-left: 130px"></input>
			</div>
			<br>


			<%
				String status = (String) request.getAttribute("Submission");
				if (status == "Service Name Already Exists.Please Modify the name of the service and re-publish it") {
			%>
			<div id="label">
				<label id="statuslbl" class="errormsg">Service already
					exists! Please try other name.</label>
			</div>
			<%
				}
			%>
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