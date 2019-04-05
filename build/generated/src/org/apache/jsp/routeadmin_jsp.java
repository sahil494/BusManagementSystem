package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class routeadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>route admin</title>\n");
      out.write("        <style>\n");
      out.write("           *{\n");
      out.write("                margin:0px;\n");
      out.write("                padding:0px;\n");
      out.write("            }\n");
      out.write("            .title\n");
      out.write("            {\n");
      out.write("                display:flex;\n");
      out.write("                flex-direction:row;\n");
      out.write("                flex-wrap:wrap;\n");
      out.write("                background-color:#34495e;\n");
      out.write("                justify-content:center;\n");
      out.write("                margin:auto;\n");
      out.write("                height:75px;\n");
      out.write("                width:100%;\n");
      out.write("                border-top:4px solid #c12341;\n");
      out.write("                border-bottom:4px solid #c12341;\n");
      out.write("                padding-top:20px;\n");
      out.write("            }\n");
      out.write("            .title h1{\n");
      out.write("                font-size:50px;\n");
      out.write("                color:#f1f1f1;\n");
      out.write("                font-style:oblique;\n");
      out.write("            }\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap:wrap;\n");
      out.write("                justify-content:center;\n");
      out.write("                text-align:center;\n");
      out.write("                margin-top:20px;\n");
      out.write("            }\n");
      out.write("            .btn\n");
      out.write("            {\n");
      out.write("                border:4px solid #3498db;\n");
      out.write("                background: none;\n");
      out.write("                padding:10px 20px;\n");
      out.write("                font-size:20px;\n");
      out.write("                font-family: \"montserrat\";\n");
      out.write("                cursor:pointer;\n");
      out.write("                margin:10px;\n");
      out.write("                transition:1s;\n");
      out.write("                position:relative;\n");
      out.write("                overflow:hidden;\n");
      out.write("            }\n");
      out.write("            .btn1,.btn2\n");
      out.write("            {\n");
      out.write("                color:#34495e;\n");
      out.write("                box-shadow: 0px 0px 10px #34495e;\n");
      out.write("            }\n");
      out.write("            .btn3,.btn4\n");
      out.write("            {\n");
      out.write("                color:#34495e;\n");
      out.write("                box-shadow:0px 0px 10px #34495e;\n");
      out.write("            }\n");
      out.write("            .btn1:hover,.btn2:hover\n");
      out.write("            {\n");
      out.write("                color:#34495e;\n");
      out.write("            }\n");
      out.write("            .btn3:hover,.btn4:hover\n");
      out.write("            {\n");
      out.write("                color:#34495e;\n");
      out.write("            }\n");
      out.write("            .btn::before\n");
      out.write("            {\n");
      out.write("               content:\"\";\n");
      out.write("               position: absolute;\n");
      out.write("               left:0;\n");
      out.write("               width:100%;\n");
      out.write("               height:100%;\n");
      out.write("               background:#3498db;\n");
      out.write("               z-index:-1;\n");
      out.write("               transition: 0.8s;\n");
      out.write("            }\n");
      out.write("            .btn1::before,.btn3::before{\n");
      out.write("                top:0;\n");
      out.write("                border-radius:0% 0% 0% 0%;\n");
      out.write("            }\n");
      out.write("            .btn2::before,.btn4::before\n");
      out.write("            {\n");
      out.write("                bottom:0;\n");
      out.write("                border-radius:0% 0% 0% 0%;\n");
      out.write("            }\n");
      out.write("            .btn1:hover::before,.btn2:hover::before\n");
      out.write("            {\n");
      out.write("                height:0%;\n");
      out.write("            }\n");
      out.write("            .btn3:hover::before,.btn4:hover::before\n");
      out.write("            {\n");
      out.write("                height: 0%;\n");
      out.write("            }\n");
      out.write("             .log\n");
      out.write("            {\n");
      out.write("                display:flex;\n");
      out.write("                flex-wrap:wrap;\n");
      out.write("                width:300px;\n");
      out.write("                padding: 20px;\n");
      out.write("                position:absolute;\n");
      out.write("                top:67%;\n");
      out.write("                left:50%;\n");
      out.write("                height:59%;\n");
      out.write("                transform: translate(-50%,-50%);\n");
      out.write("                background:black;\n");
      out.write("                text-align:center;\n");
      out.write("            }\n");
      out.write("            .log input[type=\"text\"]\n");
      out.write("            {\n");
      out.write("                border:0;\n");
      out.write("                background: none;\n");
      out.write("                display: block;\n");
      out.write("                margin:35px auto;\n");
      out.write("                text-align:center;\n");
      out.write("                border:2px solid #3498db;\n");
      out.write("                padding:14px 10px;\n");
      out.write("                width:200px;\n");
      out.write("                outline: none;\n");
      out.write("                color:white;\n");
      out.write("                border-radius:24px;\n");
      out.write("                transition:0.25s;\n");
      out.write("            }\n");
      out.write("            .log input[type=\"text\"]:focus\n");
      out.write("            {\n");
      out.write("                width:250px;\n");
      out.write("                border-color:#2ecc71;\n");
      out.write("            }\n");
      out.write("            .log input[type=\"submit\"]\n");
      out.write("            {\n");
      out.write("                border:0;\n");
      out.write("                background: none;\n");
      out.write("                display: block;\n");
      out.write("                margin:35px auto;\n");
      out.write("                text-align:center;\n");
      out.write("                border:2px solid #2ecc71;\n");
      out.write("                padding:14px 40px;\n");
      out.write("                outline: none;\n");
      out.write("                color:white;\n");
      out.write("                border-radius:24px;\n");
      out.write("                transition:0.25s;\n");
      out.write("                cursor:pointer;\n");
      out.write("            }\n");
      out.write("            .log input[type=\"submit\"]:hover\n");
      out.write("            {\n");
      out.write("                background: #2ecc71;\n");
      out.write("            }\n");
      out.write("            a\n");
      out.write("            {\n");
      out.write("              text-decoration: none;    \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <div class=\"title\">\n");
      out.write("                <h1>Route Details</h1>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <button class =\"btn btn1\"><a href=\"routeuser.jsp\">Create Route</a></button>\n");
      out.write("            <button class =\"btn btn2\"> <a href=\"viewRouteServlet\">View Route</a></button>\n");
      out.write("            <button class =\"btn btn3\">Update Route</button>\n");
      out.write("            <button class =\"btn btn4\"><a href=\"deleteroute.jsp\">Delete Route</a></button>\n");
      out.write("        </div>\n");
      out.write("        <form class=\"log\" action=\"#\" method=\"post\">\n");
      out.write("                <input type=\"text\" placeholder=\"Route-Id\" name=\"busid\">\n");
      out.write("                <input type=\"text\" placeholder=\"Route-Name\" name=\"driverid\">\n");
      out.write("            <input type=\"submit\" name=\"button\" value=\"Search\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
