<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Search Service</title>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
	padding: 85px 85px 132px 500px;
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

		<h2>Search for services:</h2>
		<form method="post" action="<%=request.getContextPath()%>/search">
			<div id="searchit">
				<h2>
					<input type="text" name="searchservice" width="100px"
						class="textbox" style="width: 200px;"></input> <input
						type="submit" name="Search" value="Search" width="20px" class="textbox"
						style="width: 100px"></input><br>
				</h2>
			</div>
		</form>
	</div>
	<div id="footer">
		<h3 align="left">
			<a href="Service.jsp">Click here to publish your
				awesome services?!</a>
		</h3>
		<h2 align="right">
			<u>Creators</u>
		</h2>
		<h2 id="footer_text">@Group 11</h2>
		<h2 id="footer_text">@Group 18</h2>
	</div>


</body>
</html>