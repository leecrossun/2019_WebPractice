/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.61
 * Generated at: 2019-11-27 18:37:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Practice34;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jspbook.pr34.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8"); 
      out.write('\r');
      out.write('\n');
      jspbook.pr34.LoginBean login = null;
      login = (jspbook.pr34.LoginBean) _jspx_page_context.getAttribute("login", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (login == null){
        login = new jspbook.pr34.LoginBean();
        _jspx_page_context.setAttribute("login", login, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("login"), request);
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>register</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

String id = login.getId();
String pw = login.getPw();
String email = login.getEmail();
String birth = login.getBirth();
int gen = login.getGender();
// 성별 구하기
String gender;
if (gen==1)
	gender="남성";
else
	gender="여성";
// 생일 구하기
String isGrown;
if (login.isGrownUp()==true)
	isGrown="성인";
else
	isGrown="미성년자";
	

      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<h2>등록내용</h2>\r\n");
      out.write("이름 : ");
      out.print( id );
      out.write(" <br>\r\n");
      out.write("패스워드 : ");
      out.print( pw );
      out.write(" <br>\r\n");
      out.write("이메일 : ");
      out.print( email );
      out.write("<br>\r\n");
      out.write("성별 : ");
      out.print( gen );
      out.write(" <br>\r\n");
      out.write("생일 : ");
      out.print( birth );
      out.write(" <br>\r\n");
      out.write("<hr>\r\n");
      out.print( id );
      out.write(" 씨는 ");
      out.print( gender );
      out.write("이고, ");
      out.print( isGrown );
      out.write(" 입니다.\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
