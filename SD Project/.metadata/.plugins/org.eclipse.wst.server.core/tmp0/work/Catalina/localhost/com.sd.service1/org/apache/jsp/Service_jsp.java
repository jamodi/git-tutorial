package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.File;

public final class Service_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Add New Service</title>\r\n");
      out.write("<style>\r\n");
      out.write("#header {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 10px 0 10px 0;\r\n");
      out.write("\theight: 130px;\r\n");
      out.write("\tbackground: #990000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header_text {\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tfont-size: 35px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer {\r\n");
      out.write("\tpadding: 5px 25px 5px 5px;\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("\tbackground: #990000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer_text {\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#content {\r\n");
      out.write("\tbackground: #FFCC00;\r\n");
      out.write("\tpadding: 85px 85px 85px 500px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<img style=\"background: gold\" src=\"smiley.gif\" alt=\"Smiley face\"\r\n");
      out.write("\t\t\twidth=\"63\" height=\"63\" border=\"5\">\r\n");
      out.write("\t\t<h1 id=\"header_text\">\r\n");
      out.write("\t\t\t<marquee behavior=\"alternate\">Recommendation And\r\n");
      out.write("\t\t\t\tCustomization Engine</marquee>\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("\t\t<form method=\"post\"\r\n");
      out.write("\t\t\taction=\"");
      out.print(request.getContextPath());
      out.write("/servicesubmit\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"domainname\">\r\n");
      out.write("\t\t\t\tDomain Name: <input type=\"text\" name=\"domain\" width=\"20px\"\r\n");
      out.write("\t\t\t\t\tclass=\"textbox\" style=\"width: 300px; margin-left: 100px\"></input><br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div id=\"servicename\">\r\n");
      out.write("\t\t\t\tService Name: <input type=\"text\" name=\"servicename\" width=\"20px\"\r\n");
      out.write("\t\t\t\t\tclass=\"textbox\" style=\"width: 300px; margin-left: 101px\"></input><br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div id=\"desc\">\r\n");
      out.write("\t\t\t\tDescription:<input type=\"text\" name=\"desc\" width=\"20px\"\r\n");
      out.write("\t\t\t\t\tclass=\"textbox\" style=\"width: 300px; margin-left: 118px\"></input><br>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div id=\"submit\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" class=\"buttons\" value=\"GO!\" size=\"100\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 50px; margin-left: 130px\"></input>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				String status = (String) request.getAttribute("Submission");
				if (status == "Service Name Already Exists.Please Modify the name of the service and re-publish it") {
			
      out.write("\r\n");
      out.write("\t\t\t<div id=\"label\">\r\n");
      out.write("\t\t\t\t<label id=\"statuslbl\" class=\"errormsg\">Service already\r\n");
      out.write("\t\t\t\t\texists! Please try other name.</label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t<h3 align=\"left\">\r\n");
      out.write("\t\t\t<a href=\"Service.jsp\">Click here to publish your awesome\r\n");
      out.write("\t\t\t\tservices?!</a>\r\n");
      out.write("\t\t</h3>\r\n");
      out.write("\t\t<h2 align=\"right\">\r\n");
      out.write("\t\t\t<u>Creators</u>\r\n");
      out.write("\t\t</h2>\r\n");
      out.write("\t\t<h2 id=\"footer_text\">@Group 11</h2>\r\n");
      out.write("\t\t<h2 id=\"footer_text\">@Group 18</h2>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
