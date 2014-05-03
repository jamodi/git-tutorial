package com.sd.service1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/query")
public class Status {

	@GET
	@Path("/degreec")
	@Produces(MediaType.TEXT_HTML)
	public String returnF(@QueryParam("temp") int c) {
		int x = c * 9 / 5 + 32;
		return "<br><br><br><br><h1><marquee align=\"center\">" + c
				+ "&#8451; is equal to " + x + "&#8457;</marquee><h1>";
	}

	@GET
	@Path("/degreef")
	@Produces(MediaType.TEXT_HTML)
	public String returnC(@QueryParam("temp") int f) {
		int x = (f - 32) * 5 / 9;
		return "<br><br><br><br><h1><marquee align=\"center\">" + f
				+ "&#8457; is equal to " + x + "&#8451;</marquee><h1>";
	}

	@GET
	@Path("/time")
	@Produces(MediaType.TEXT_HTML)
	public String returnT(@QueryParam("temp") String x) {

		switch (x) {

		case "time":
			DateFormat dateFormat0 = new SimpleDateFormat("HH:mm:ss");
			Calendar cal0 = Calendar.getInstance();
			return "<br><br><br><br><h1><marquee align=\"center\">"
					+ (dateFormat0.format(cal0.getTime())) + "</marquee><h1>";

		case "date":
			DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal1 = Calendar.getInstance();
			return "<br><br><br><br><h1><marquee align=\"center\">"
					+ (dateFormat1.format(cal1.getTime())) + "</marquee><h1>";

		case "time&date":
			DateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss yyyy/MM/dd");
			Calendar cal2 = Calendar.getInstance();
			return "<br><br><br><br><h1><marquee align=\"center\">"
					+ (dateFormat2.format(cal2.getTime())) + "</marquee><h1>";

		case "date&time":
			DateFormat dateFormat3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Calendar cal3 = Calendar.getInstance();
			return "<br><br><br><br><h1><marquee align=\"center\">"
					+ (dateFormat3.format(cal3.getTime())) + "</marquee><h1>";
		}
		return null;
	}

	@GET
	@Path("/bmi")
	@Produces(MediaType.TEXT_HTML)
	public String returnB(@QueryParam("temp1") int w,
			@QueryParam("temp2") float h) {
		float h1 = h * h;
		float bmi = w / h1;
		return "<br><br><br><br><h1><marquee align=\"center\">"
				+ "Your BMI is: " + bmi + "</marquee></h1>";
	}

	@GET
	@Path("/calculator")
	@Produces(MediaType.TEXT_HTML)
	public String calender(@QueryParam("temp1") String a,
			@QueryParam("temp2") String op, @QueryParam("temp3") String b) {

		Integer answer = 0;
		Integer inputA, inputB;
		char operator;
		inputA = Integer.parseInt(a);
		operator = op.charAt(0);
		inputB = Integer.parseInt(b);
		switch (operator) {
		case '+':
			answer = inputA + inputB;
			break;
		case '-':
			answer = inputA - inputB;
			break;
		case '*':
			answer = inputA * inputB;
			break;
		case '/':
			answer = inputA / inputB;
			break;
		case '^':
			answer = inputA ^ inputB;
			break;

		}
		return "<br><br><br><br><h1><marquee align=\"center\">" + answer
				+ "</marquee></h1>";
	}

	@GET
	@Path("/save")
	@Produces(MediaType.TEXT_HTML)
	public String saveServices(@QueryParam("service1") String service1,
			@QueryParam("service2") String service2,
			@QueryParam("service3") String service3,
			@QueryParam("service4") String service4,
			@QueryParam("color1") String color1,
			@QueryParam("color2") String color2,
			@QueryParam("color3") String color3,
			@QueryParam("color4") String color4,
			@QueryParam("tenantid") String tenantid) {

		String flag = null;
	
		if (service1.equals(null))
		{
			service1="--";
			
		}
		
		if (service2.equals(null))
		{
			service2="--";
		}
		
		if (service3.equals(null))
		{
			service3="--";
		}
		
		if (service4.equals(null))
		{
			service4="--";
		}
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

		}

		catch (Exception e) {
			// out.println("Class not found");
			flag = "Services could not be saved";
		}

		Connection connection = null;
		Statement stmt = null;

		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/secure_bank_system", "root",
					"workhard");

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			flag = "Services could not be saved";
		}

		// out.println(connection);

		if (connection != null) {
			System.out.println("Not null. Connection established!");
			System.out.println("1" + service1 + service2 + service3 + service4);
			try {
				stmt = connection.createStatement();
				String sql = "UPDATE TENANT SET SERVICE1='" + service1
						+ "',service2='" + service2 + "',service3='" + service3
						+ "',service4='" + service4 + "',color1='" + color1
						+ "',color2='" + color2 + "',color3='" + color3
						+ "',color4='" + color4 + "'where tenantid=" + tenantid;
				stmt.execute(sql);
				System.out.println("Data updated successfully !");
				flag = "Services saved successfully!!";
			} catch (SQLException e) {
				System.out.println("Connection Failed! Check output console");
				e.printStackTrace();
				flag = "Services could not be saved";
			}
		}

		else {
			flag = "Services could not be saved";
			System.out.println("Error establishing connection");
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return "<br><br><br><br><h1 align=\"center\">" + flag + "<h1>";
	}

}
