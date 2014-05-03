<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	try {
		Class.forName("com.mysql.jdbc.Driver");

	} catch (Exception e) {
		out.println("Login not successful");
	}
	Connection connection = null;
	try {
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/secure_bank_system",
				"root", "workhard");
	} catch (SQLException e) {
		System.out.println("Login not successful");
		e.printStackTrace();
		return;
	}

	if (connection == null) {

		out.println("Login not successful");
	}
	String userid = request.getParameter("username");
	String pwd = request.getParameter("password");
	String type1 = request.getParameter("type");
%>
<html>
<title>Tenant Page</title>
<head>
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
	padding: 1px 85px 25px 500px;
}
</style>
</head>
<body>
	<div id="header">
		<img style="background: gold" src="smiley.gif" alt="Smiley face"
			width="68" height="68" border="5">
		<h1 id="header_text">
			<marquee behavior="alternate">Recommendation And
				Customization Engine</marquee>
		</h1>
	</div>

	<%
		String serv1 = null;
		String serv2 = null;
		String serv3 = null;
		String serv4 = null;
		String color1 = null;
		String color2 = null;
		String color3 = null;
		String color4 = null;
		String tenantid = null;

		if (type1.equals("user")) {
			String query = "select * from user";
			Statement st;
			st = connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			//out.println(rs);
			while (rs.next()) {
				String s = rs.getString("userID");
				String p = rs.getString("password");
				String tenant = rs.getString("tenantID");

				if (s.equals(userid)) {
					//Match has been found. Get the details from the tenantID
					String queryTenant = "SELECT * FROM tenant WHERE tenantID='"
							+ tenant + "'";

					if (p.equals(pwd)) {

						Statement stat1;
						stat1 = connection.createStatement();
						ResultSet rst1 = stat1.executeQuery(queryTenant);
						while (rst1.next()) {
							serv1 = rst1.getString("service1");
							serv2 = rst1.getString("service2");
							serv3 = rst1.getString("service3");
							serv4 = rst1.getString("service4");
							color1 = rst1.getString("color1");
							color2 = rst1.getString("color2");
							color3 = rst1.getString("color3");
							color4 = rst1.getString("color4");
							tenantid = rst1.getString("tenantID");
						}
					} else {
						out.println("Enter the right password");
						String site = "a.html";
						response.sendRedirect(site);
					}
				} else {
					String site = "a.html";
					response.sendRedirect(site);
					out.println("Login not successful");
				}
			}
		} else if (type1.equals("tenant")) {

			String query = "select * from tenant";
			Statement st;
			st = connection.createStatement();
			ResultSet rst = st.executeQuery(query);
			//out.println(rs);
			while (rst.next()) {
				String s = rst.getString("name");
				String p = rst.getString("password");

				if (s.equals(userid)) {

					if (p.equals(pwd)) {

						//Once the tenant is logged in, store the service IDs
						int s1, s2, s3, s4;
						//rs=statement.executeQuery("SELECT * FROM students WHERE firstname='" + request.getParameter("searchStudent") + "'");
						String q1 = "SELECT * FROM tenant WHERE name='"
								+ request.getParameter("username") + "'";
						Statement st1;
						st1 = connection.createStatement();
						ResultSet rs1 = st1.executeQuery(q1);
						while (rs1.next()) {
							serv1 = rs1.getString("service1");
							serv2 = rs1.getString("service2");
							serv3 = rs1.getString("service3");
							serv4 = rs1.getString("service4");
							color1 = rs1.getString("color1");
							color2 = rs1.getString("color2");
							color3 = rs1.getString("color3");
							color4 = rs1.getString("color4");
							tenantid = rs1.getString("tenantID");
						}
					} else {
						String site = "a.html";
						response.sendRedirect(site);
						out.println("Enter the right password");
					}
				} else {
					String site = "a.html";
					response.sendRedirect(site);
					out.println("Login not successful");
				}
			}
		}
		pageContext.setAttribute("serv1", serv1);
		pageContext.setAttribute("serv2", serv2);
		pageContext.setAttribute("serv3", serv3);
		pageContext.setAttribute("serv4", serv4);
		pageContext.setAttribute("color1", color1);
		pageContext.setAttribute("color2", color2);
		pageContext.setAttribute("color3", color3);
		pageContext.setAttribute("color4", color4);
		pageContext.setAttribute("tenantid", tenantid);
		session.setAttribute("tenantid", tenantid);
	%>

	<div id="content">

		<h1>
			Welcome
			<c:out value="${param.username}" />
			! <br>
		</h1>
		<c:set var="typeuser" scope="session" value="user" />
		<c:choose>
			<c:when test="${param.type eq typeuser}">
				<form name=Home method="POST"
					action="/com.sd.service1/userServices.jsp">
					<input type="hidden" name="username" value="${param.username}">

					<input type="hidden" name="temp1" value="${serv1}"> <input
						type="hidden" name="temp2" value="${serv2}"> <input
						type="hidden" name="temp3" value="${serv3}"> <input
						type="hidden" name="temp4" value="${serv4}"> <input
						type="hidden" name="color1" value="${color1}"> <input
						type="hidden" name="color2" value="${color2}"> <input
						type="hidden" name="color3" value="${color3}"> <input
						type="hidden" name="color4" value="${color4}">

					<p>
						<b>Personalized Desktop Environment</b>
					</p>
					<br> <input type="submit" value="Services Page">
				</form>
			</c:when>
			<c:otherwise>
				<form name=Home method="POST" action="/com.sd.service1/workflow.jsp">
					<input type="hidden" name="tenantid" value="${tenantid}"> <b>Selected
						Service 1:</b> <input type="text" name="temp1" value="${serv1}">
					<br> <b>Selected Service 2:</b> <input type="text"
						name="temp2" value="${serv2}"> <br> <b>Selected
						Service 3: </b><input type="text" name="temp3" value="${serv3}">
					<br> <b>Selected Service 4:</b> <input type="text"
						name="temp4" value="${serv4}"> <br> <br> <input
						type="submit" value="Modify Already Selected Services">
				</form>
				<form name=Home method="POST"
					action="/com.sd.service1/Searchresults.jsp">
					<input type="hidden" name="tenantid" value="${tenantid}">
					<p>
						<b>Want to search a new Service or Workflow?</b>
					</p>
					<input type="submit" value="Start a New Search">
				</form>
			</c:otherwise>
		</c:choose>

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