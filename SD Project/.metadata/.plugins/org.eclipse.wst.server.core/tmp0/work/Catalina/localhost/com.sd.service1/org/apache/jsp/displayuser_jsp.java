package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class displayuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<title>Tenant Page</title>\r\n");
      out.write("<head>\r\n");
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
      out.write("\tpadding: 1px 85px 25px 500px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<img style=\"background: gold\" src=\"smiley.gif\" alt=\"Smiley face\"\r\n");
      out.write("\t\t\twidth=\"68\" height=\"68\" border=\"5\">\r\n");
      out.write("\t\t<h1 id=\"header_text\">\r\n");
      out.write("\t\t\t<marquee behavior=\"alternate\">Recommendation And\r\n");
      out.write("\t\t\t\tCustomization Engine</marquee>\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");

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
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h1>\r\n");
      out.write("\t\t\tWelcome\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t! <br>\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t<h3 align=\"left\">\r\n");
      out.write("\t\t\t<a href=\"Service.jsp\">Click here to publish your\r\n");
      out.write("\t\t\t\tawesome services?!</a>\r\n");
      out.write("\t\t</h3>\r\n");
      out.write("\t\t<h2 align=\"right\">\r\n");
      out.write("\t\t\t<u>Creators</u>\r\n");
      out.write("\t\t</h2>\r\n");
      out.write("\t\t<h2 id=\"footer_text\">@Group 11</h2>\r\n");
      out.write("\t\t<h2 id=\"footer_text\">@Group 18</h2>\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /displayuser.jsp(191,3) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.username}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /displayuser.jsp(194,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("typeuser");
    // /displayuser.jsp(194,2) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("session");
    // /displayuser.jsp(194,2) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new String("user"));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /displayuser.jsp(196,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.type eq typeuser}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<form name=Home method=\"POST\"\r\n");
        out.write("\t\t\t\t\taction=\"/com.sd.service1/userServices.jsp\">\r\n");
        out.write("\t\t\t\t\t<input type=\"hidden\" name=\"username\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t<input type=\"hidden\" name=\"temp1\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serv1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"> <input\r\n");
        out.write("\t\t\t\t\t\ttype=\"hidden\" name=\"temp2\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serv2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"> <input\r\n");
        out.write("\t\t\t\t\t\ttype=\"hidden\" name=\"temp3\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serv3}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"> <input\r\n");
        out.write("\t\t\t\t\t\ttype=\"hidden\" name=\"temp4\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serv4}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"> <input\r\n");
        out.write("\t\t\t\t\t\ttype=\"hidden\" name=\"color1\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${color1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"> <input\r\n");
        out.write("\t\t\t\t\t\ttype=\"hidden\" name=\"color2\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${color2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"> <input\r\n");
        out.write("\t\t\t\t\t\ttype=\"hidden\" name=\"color3\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${color3}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"> <input\r\n");
        out.write("\t\t\t\t\t\ttype=\"hidden\" name=\"color4\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${color4}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t<p>\r\n");
        out.write("\t\t\t\t\t\t<b>Personalized Desktop Environment</b>\r\n");
        out.write("\t\t\t\t\t</p>\r\n");
        out.write("\t\t\t\t\t<br> <input type=\"submit\" value=\"Services Page\">\r\n");
        out.write("\t\t\t\t</form>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<form name=Home method=\"POST\" action=\"/com.sd.service1/workflow.jsp\">\r\n");
        out.write("\t\t\t\t\t<input type=\"hidden\" name=\"tenantid\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tenantid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"> <b>Selected\r\n");
        out.write("\t\t\t\t\t\tService 1:</b> <input type=\"text\" name=\"temp1\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serv1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t\t\t\t<br> <b>Selected Service 2:</b> <input type=\"text\"\r\n");
        out.write("\t\t\t\t\t\tname=\"temp2\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serv2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"> <br> <b>Selected\r\n");
        out.write("\t\t\t\t\t\tService 3: </b><input type=\"text\" name=\"temp3\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serv3}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t\t\t\t<br> <b>Selected Service 4:</b> <input type=\"text\"\r\n");
        out.write("\t\t\t\t\t\tname=\"temp4\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serv4}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"> <br> <br> <input\r\n");
        out.write("\t\t\t\t\t\ttype=\"submit\" value=\"Modify Already Selected Services\">\r\n");
        out.write("\t\t\t\t</form>\r\n");
        out.write("\t\t\t\t<form name=Home method=\"POST\"\r\n");
        out.write("\t\t\t\t\taction=\"/com.sd.service1/Searchresults.jsp\">\r\n");
        out.write("\t\t\t\t\t<input type=\"hidden\" name=\"tenantid\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tenantid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t\t\t\t<p>\r\n");
        out.write("\t\t\t\t\t\t<b>Want to search a new Service or Workflow?</b>\r\n");
        out.write("\t\t\t\t\t</p>\r\n");
        out.write("\t\t\t\t\t<input type=\"submit\" value=\"Start a New Search\">\r\n");
        out.write("\t\t\t\t</form>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}
