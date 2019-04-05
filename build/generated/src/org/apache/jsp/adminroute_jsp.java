package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminroute_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>routeuser</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("           *{\n");
      out.write("                margin:0;\n");
      out.write("                padding:0;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-image:url(\"a2.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            .title\n");
      out.write("            {\n");
      out.write("                display:flex;\n");
      out.write("                flex-direction:row;\n");
      out.write("                flex-wrap:wrap;\n");
      out.write("                background-color:#34495e;;\n");
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
      out.write("            .log\n");
      out.write("            {\n");
      out.write("                display:flex;\n");
      out.write("                flex-wrap:wrap;\n");
      out.write("                width:300px;\n");
      out.write("                padding: 20px;\n");
      out.write("                position:absolute;\n");
      out.write("                top:60%;\n");
      out.write("                left:50%;\n");
      out.write("                height: 67%;\n");
      out.write("                transform: translate(-50%,-50%);\n");
      out.write("                background-color:rgba(0,0,0,0.45);\n");
      out.write("                text-align:center;\n");
      out.write("            }\n");
      out.write("            .log h1\n");
      out.write("            {\n");
      out.write("                color:white;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                font-weight:500;\n");
      out.write("            }\n");
      out.write("            .log input[type=\"text\"]\n");
      out.write("            {\n");
      out.write("                border:0;\n");
      out.write("                background: none;\n");
      out.write("                display: block;\n");
      out.write("                margin:35px auto;\n");
      out.write("                text-align:center;\n");
      out.write("                border:2px solid red;\n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <div class=\"title\">\n");
      out.write("                <h1>View Route Details</h1>\n");
      out.write("            </div>\n");
      out.write("        <form class=\"log\" action=\"#\" method=\"post\">\n");
      out.write("                <input type=\"text\" placeholder=\"Route-Id\" name=\"routeid\">\n");
      out.write("                <input type=\"text\" placeholder=\"Departure-From\" name=\"departurefrom\">\n");
      out.write("                <input type=\"text\" placeholder=\"Destination\" name=\"Destination\">\n");
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
