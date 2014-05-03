package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.Map.*;

public final class DisplayResults_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tbackground-color: #efeeef;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h3 {\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("\tmargin-left:25%;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tbackground-color: red;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\twidth: 50%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tbackground-color: rgba(31, 45, 73, 0.83);\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2 {\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tbackground-color: red;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tbackground-color: rgba(31, 45, 73, 0.83);\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".body {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tmax-width: 960px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tmargin-top: 2%;\r\n");
      out.write("\tmargin-left: 20%;\r\n");
      out.write("\tmargin-right: 20%;\r\n");
      out.write("\tmargin-left: 20%;\r\n");
      out.write("\tmargin-top: 2%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".description {\r\n");
      out.write("\tbackground-color: rgb(84, 99, 119);\r\n");
      out.write("\tmargin-left: 10%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".txtSearch {\r\n");
      out.write("\twidth: 700px;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btnSearch {\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".computationType tr td {\r\n");
      out.write("\tpadding-left: 20px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td {\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h2>Search Results</h2>\r\n");
      out.write("\t<div class=\"body\">\r\n");
      out.write("\t\t");

	HashMap<String,Integer> mymap = (HashMap<String,Integer>) request
	.getAttribute("content");

	
      out.write('\r');
      out.write('\n');
      out.write('	');

	ArrayList<String> myworkflows=(ArrayList<String>) request.getAttribute("workflow");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<h3>List of Available services</h3>\r\n");
      out.write("\t\t<table align=\"center\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<th>Service Name    </th>\r\n");
      out.write("\t\t<th>Service ID,Description</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t");

				for (Entry<String, Integer> a : mymap.entrySet()) {
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(a.getKey());
      out.write("    </td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(a.getValue());
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<h3>List of Suggested Workflows</h3>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<th>Workflow(s)</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t");

				for (String services:myworkflows) {
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(services);
      out.write("    </td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<form method=\"post\" action=\"");
      out.print(request.getContextPath() );
      out.write("/statements\">\r\n");
      out.write("\r\n");
      out.write("\t\tEnter the service order :<br> <br> Service 1 <input type=\"text\" name=\"service1\"> <select name=\"colorMenu1\">\r\n");
      out.write("\t\t\t<option value=\"white\"></option>\r\n");
      out.write("\t\t\t<option value=\"red\">red</option>\r\n");
      out.write("\t\t\t<option value=\"green\">green</option>\r\n");
      out.write("\t\t\t<option value=\"blue\">blue</option>\r\n");
      out.write("\t\t</select><br>\r\n");
      out.write("\t\t<br> <br> Service 2 <input type=\"text\" name=\"service2\">\r\n");
      out.write("\t\t<select name=\"colorMenu2\">\r\n");
      out.write("\t\t\t<option value=\"white\"></option>\r\n");
      out.write("\t\t\t<option value=\"red\">red</option>\r\n");
      out.write("\t\t\t<option value=\"green\">green</option>\r\n");
      out.write("\t\t\t<option value=\"blue\">blue</option>\r\n");
      out.write("\t\t</select><br>\r\n");
      out.write("\t\t<br> <br> Service 3 <input type=\"text\" name=\"service3\">\r\n");
      out.write("\t\t<select name=\"colorMenu3\">\r\n");
      out.write("\t\t\t<option value=\"white\"></option>\r\n");
      out.write("\t\t\t<option value=\"red\">red</option>\r\n");
      out.write("\t\t\t<option value=\"green\">green</option>\r\n");
      out.write("\t\t\t<option value=\"blue\">blue</option>\r\n");
      out.write("\t\t</select><br>\r\n");
      out.write("\t\t<br> <br> Service 4 <input type=\"text\" name=\"service4\">\r\n");
      out.write("\t\t<select name=\"colorMenu4\">\r\n");
      out.write("\t\t\t<option value=\"white\"></option>\r\n");
      out.write("\t\t\t<option value=\"red\">red</option>\r\n");
      out.write("\t\t\t<option value=\"green\">green</option>\r\n");
      out.write("\t\t\t<option value=\"blue\">blue</option>\r\n");
      out.write("\t\t</select><br>\r\n");
      out.write("\t\t<br> <br> <input type=\"submit\" value=\"submit\"><br>\r\n");
      out.write("\t</form>\r\n");
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
