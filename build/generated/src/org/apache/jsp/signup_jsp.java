package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>signup</title>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image:url(\"s2.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            .title\n");
      out.write("            {\n");
      out.write("                font-size:30px;\n");
      out.write("                color:#fefefe;\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding:none;\n");
      out.write("                letter-spacing: 1px;\n");
      out.write("                margin:0px\n");
      out.write("            }\n");
      out.write("            .sign-up\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("                max-width:300px;\n");
      out.write("                background-color:rgba(158,158,158,0.3);\n");
      out.write("                padding:30px;\n");
      out.write("                color:white;\n");
      out.write("                font-family:sans-serif;\n");
      out.write("                font-weight:bold;\n");
      out.write("                letter-spacing:1px;\n");
      out.write("                margin:auto;\n");
      out.write("                margin-top:45px;\n");
      out.write("                font-style:oblique;\n");
      out.write("            }\n");
      out.write("            input[type=text],input[type=password]\n");
      out.write("            {\n");
      out.write("                width:90%;\n");
      out.write("                padding:10px;\n");
      out.write("                margin:10px 0;\n");
      out.write("            }\n");
      out.write("            input[type=submit]\n");
      out.write("            {\n");
      out.write("                width:100%;\n");
      out.write("                padding:10px;\n");
      out.write("                margin-top:30px;\n");
      out.write("                border:none;\n");
      out.write("                color:white;\n");
      out.write("                font-size:20px;\n");
      out.write("                font-weight:bold;\n");
      out.write("                letter-spacing:1px;\n");
      out.write("                cursor:pointer;\n");
      out.write("                box-shadow: white -1px 1px,white -2px 2px,white -3px 3px;\n");
      out.write("                background-color: rgba(171,116,181,0.3);\n");
      out.write("            }\n");
      out.write("            span{\n");
      out.write("                font-size:15px;\n");
      out.write("            }\n");
      out.write("            @media screen and (max-width:600px)\n");
      out.write("            {\n");
      out.write("                input[type=submit]\n");
      out.write("                {\n");
      out.write("                    width:100%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            select \n");
      out.write("            {\n");
      out.write("                height:30px;\n");
      out.write("                width:200px;\n");
      out.write("                margin:6px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"sign-up\">\n");
      out.write("            <div class=\"title\">Create an account</div>\n");
      out.write("            <hr><br>\n");
      out.write("            <form action=\"userServlet\" method=\"post\">\n");
      out.write("                <label for=\"email\">Name</label>\n");
      out.write("                <input name=\"name\" type=\"text\" placeholder=\"Name\" required>\n");
      out.write("                <label for=\"email\">Email</label>\n");
      out.write("                <input name=\"email\" type=\"text\" placeholder=\"Email\" required>\n");
      out.write("                <label for = \"password\">Password</label>\n");
      out.write("                <input name=\"password\" type=\"password\" placeholder=\"Password\" required>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"email\">Contact</label>\n");
      out.write("                <input name=\"contact\" type=\"text\" placeholder=\"Contact\" required>\n");
      out.write("                <br><br>\n");
      out.write("                <label for = \"text\">Route</label>\n");
      out.write("                <select name=\"route\">\n");
      out.write("                    <option>Panchkula</option>\n");
      out.write("                    <option>Kalka</option>\n");
      out.write("                    <option>Pinjore</option>\n");
      out.write("                    <option>Chandigrah</option>\n");
      out.write("                    <option>Parwanoo</option>\n");
      out.write("                </select>\n");
      out.write("                <input type=\"submit\" value=\"Signup\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
