<%@ page import="java.util.*"%>
<%@ page import="java.util.Map.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Home</title>
<style type="text/css">
body {
	margin: 0px;
	padding: 0px;
	background-color: #efeeef;
}

h3 {
	margin-top: 10px;
	margin-left:25%;
	padding: 10px;
	background-color: red;
	color: white;
	display: block;
	width: 50%;
	text-align: center;
	display: block;
	background-color: rgba(31, 45, 73, 0.83);
	padding: 10px;
}

h2 {
	margin: 0px;
	padding: 10px;
	background-color: red;
	color: white;
	display: block;
	width: 100%;
	text-align: center;
	display: block;
	background-color: rgba(31, 45, 73, 0.83);
	padding: 10px;
}

.body {
	display: block;
	max-width: 960px;
	text-align: center;
	margin-top: 2%;
	margin-left: 20%;
	margin-right: 20%;
	margin-left: 20%;
	margin-top: 2%;
}

.description {
	background-color: rgb(84, 99, 119);
	margin-left: 10%;
}

.txtSearch {
	width: 700px;
	height: 30px;
}

.btnSearch {
	width: 100px;
	height: 30px;
}

.computationType tr td {
	padding-left: 20px
}

td {
	text-align: left;
}
</style>
</head>
<body>
	<h2>Search Results</h2>
	<div class="body">
		<%
	HashMap<String,Integer> mymap = (HashMap<String,Integer>) request
	.getAttribute("content");

	%>
	<%
	ArrayList<String> myworkflows=(ArrayList<String>) request.getAttribute("workflow");
	%>

		<h3>List of Available services</h3>
		<table align="center">
		<tr>
		<th>Service Name    </th>
		<th>Service ID,Description</th>
		</tr>
			<%
				for (Entry<String, Integer> a : mymap.entrySet()) {
			%>
			<tr>
				<td><%=a.getKey()%>    </td>
				<td><%=a.getValue()%></td>
			</tr>
			<%
				}
			%>
		</table>
		<h3>List of Suggested Workflows</h3>
		<tr>
		<th>Workflow(s)</th>
		</tr>
		<table align="center">
			<%
				for (String services:myworkflows) {
			%>
			<tr>
				<td><%=services%>    </td>
				
			</tr>
			<%
				}
			%>
			
		</table>
	</div>
	<form method="post" action="<%=request.getContextPath() %>/statements">

		Enter the service order :<br> <br> Service 1 <input type="text" name="service1"> <select name="colorMenu1">
			<option value="white"></option>
			<option value="red">red</option>
			<option value="green">green</option>
			<option value="blue">blue</option>
		</select><br>
		<br> <br> Service 2 <input type="text" name="service2">
		<select name="colorMenu2">
			<option value="white"></option>
			<option value="red">red</option>
			<option value="green">green</option>
			<option value="blue">blue</option>
		</select><br>
		<br> <br> Service 3 <input type="text" name="service3">
		<select name="colorMenu3">
			<option value="white"></option>
			<option value="red">red</option>
			<option value="green">green</option>
			<option value="blue">blue</option>
		</select><br>
		<br> <br> Service 4 <input type="text" name="service4">
		<select name="colorMenu4">
			<option value="white"></option>
			<option value="red">red</option>
			<option value="green">green</option>
			<option value="blue">blue</option>
		</select><br>
		<br> <br> <input type="submit" value="submit"><br>
	</form>
</body>
</html>