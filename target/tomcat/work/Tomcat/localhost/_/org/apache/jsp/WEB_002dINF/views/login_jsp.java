/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
<<<<<<< HEAD
 * Generated at: 2017-03-18 06:12:59 UTC
=======
 * Generated at: 2017-03-18 05:29:23 UTC
>>>>>>> b608f21ea311e18cbf46fdcacd840503d85dbe4d
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

<<<<<<< HEAD
  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/../views/include/js.jsp", Long.valueOf(1487234202278L));
    _jspx_dependants.put("/WEB-INF/views/../views/include/css.jsp", Long.valueOf(1487234202145L));
  }

=======
>>>>>>> b608f21ea311e18cbf46fdcacd840503d85dbe4d
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
      response.setContentType("text/html;charset=UTF-8");
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
<<<<<<< HEAD
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>KaishengCRM</title>\r\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap 3.3.6 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<!-- Font Awesome -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/dist/css/fontawesome/css/font-awesome.min.css\">\r\n");
      out.write("<!-- Theme style -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/dist/css/AdminLTE.min.css\">\r\n");
      out.write("<!-- AdminLTE Skins. Choose a skin from the css/skins\r\n");
      out.write("folder instead of downloading all of them to reduce the load. -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/dist/css/skins/_all-skins.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/plugins/iCheck/square/blue.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition login-page\">\r\n");
      out.write("<div class=\"login-box\">\r\n");
      out.write("    <div class=\"login-logo\">\r\n");
      out.write("        <a href=\"/\"><b>KaiSheng</b>CRM</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.login-logo -->\r\n");
      out.write("    <div class=\"login-box-body\">\r\n");
      out.write("\r\n");
      out.write("        <form action=\"/\" method=\"post\">\r\n");
      out.write("            <div class=\"form-group has-feedback\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"username\" autofocus placeholder=\"账号\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group has-feedback\">\r\n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"密码\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-xs-8\">\r\n");
      out.write("                    <div class=\"checkbox icheck\">\r\n");
      out.write("                        <label>\r\n");
      out.write("                            <input type=\"checkbox\"> 记住我\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.col -->\r\n");
      out.write("                <div class=\"col-xs-4\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-block btn-flat\">登录</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.col -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"#\">忘记密码</a><br>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.login-box-body -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.login-box -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery 2.2.0 -->\r\n");
      out.write("<script src=\"/static/plugins/jQuery/jQuery-2.2.0.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 3.3.6 -->\r\n");
      out.write("<script src=\"/static/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"/static/dist/js/app.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE for demo purposes -->\r\n");
      out.write("<script src=\"/static/dist/js/demo.js\"></script>");
      out.write("\r\n");
      out.write("<!-- iCheck -->\r\n");
      out.write("<script src=\"/static/plugins/iCheck/icheck.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $('input').iCheck({\r\n");
      out.write("            checkboxClass: 'icheckbox_square-blue',\r\n");
      out.write("            radioClass: 'iradio_square-blue',\r\n");
      out.write("            increaseArea: '20%' // optional\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
=======
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>login!!!!!</h1>\r\n");
>>>>>>> b608f21ea311e18cbf46fdcacd840503d85dbe4d
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
