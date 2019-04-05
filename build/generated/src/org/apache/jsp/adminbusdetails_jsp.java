package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminbusdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>admin bus page </title>\n");
      out.write("        <style>\n");
      out.write("           *{\n");
      out.write("                margin:0;\n");
      out.write("                padding:0;\n");
      out.write("            }\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("            background-image:url(\"v3.jpg\");\n");
      out.write("            background-size: cover;\n");
      out.write("            }\n");
      out.write("           @keyframes ani1\n");
      out.write("{\n");
      out.write("\t0%\n");
      out.write("\t{\n");
      out.write("\t\ttop: -100px;\n");
      out.write("\t}\n");
      out.write("\t100%\n");
      out.write("\t{\n");
      out.write("\t\ttop:20px;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write(".btt\n");
      out.write("{\n");
      out.write("\tbackground-color:#000066;\n");
      out.write("\tcolor:white;\n");
      out.write("\tborder:none;\n");
      out.write("\tpadding:12px 28px;\n");
      out.write("\tborder-radius:10px;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\topacity: 0px;\n");
      out.write("\tposition: absolute;\n");
      out.write("        font-size:40px;\n");
      out.write("\ttop:20px;\n");
      out.write("\tleft:530px;\n");
      out.write("\tanimation-name:ani1;\n");
      out.write("\tanimation-duration: 2s;\n");
      out.write("\tanimation-delay:0s;\n");
      out.write("\tanimation-fill-mode:forwards;\n");
      out.write("}\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap:wrap;\n");
      out.write("                justify-content:center;\n");
      out.write("                text-align:center;\n");
      out.write("                margin-top:120px;\n");
      out.write("            }\n");
      out.write("            .btn\n");
      out.write("            {\n");
      out.write("                background: none;\n");
      out.write("                padding:14px 10px;\n");
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
      out.write("               background:#718093;\n");
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
      out.write("            .log\n");
      out.write("            {\n");
      out.write("                display:flex;\n");
      out.write("                flex-wrap:wrap;\n");
      out.write("                width:300px;\n");
      out.write("                padding: 20px;\n");
      out.write("                position:absolute;\n");
      out.write("                top:70%;\n");
      out.write("                left:50%;\n");
      out.write("                height: 50%;\n");
      out.write("                transform: translate(-50%,-50%);\n");
      out.write("                background:rgba(158,158,158,0.5);\n");
      out.write("                text-align:center;\n");
      out.write("            }\n");
      out.write("            .log input[type=\"text\"]\n");
      out.write("            {\n");
      out.write("                border:0;\n");
      out.write("                background: none;\n");
      out.write("                display: block;\n");
      out.write("                margin:30px auto;\n");
      out.write("                text-align:center;\n");
      out.write("                border:2px solid #34495e;\n");
      out.write("                padding:14px 10px;\n");
      out.write("                width:200px;\n");
      out.write("                outline: none;\n");
      out.write("                color:#f1f1f1;\n");
      out.write("                border-radius:24px;\n");
      out.write("                transition:0.25s;\n");
      out.write("            }\n");
      out.write("            .log input[type=\"text\"]:focus\n");
      out.write("            {\n");
      out.write("                width:250px;\n");
      out.write("                border-color:#34495e;\n");
      out.write("            }\n");
      out.write("            .log input[type=\"submit\"]\n");
      out.write("            {\n");
      out.write("                border:0;\n");
      out.write("                background: none;\n");
      out.write("                display: block;\n");
      out.write("                margin:30px auto;\n");
      out.write("                text-align:center;\n");
      out.write("                border:2px solid #006266;\n");
      out.write("                padding:14px 40px;\n");
      out.write("                outline: none;\n");
      out.write("                color:#f1f1f1;\n");
      out.write("                border-radius:24px;\n");
      out.write("                transition:0.25s;\n");
      out.write("                cursor:pointer;\n");
      out.write("            }\n");
      out.write("            .log input[type=\"submit\"]:hover\n");
      out.write("            {\n");
      out.write("                background:#34495e;\n");
      out.write("                border-color:whitesmoke;\n");
      out.write("            }\n");
      out.write("            a\n");
      out.write("            {\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            ::placeholder\n");
      out.write("            {\n");
      out.write("                color:#70a1ff;\n");
      out.write("                font-size:20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <button class=\"btt\">BUS DETAILS</button>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <button class =\"btn btn1\"><a href=\"createadminbus.jsp\">Create Record</a></button>\n");
      out.write("            <button class =\"btn btn2\"><a href=\"viewBus\">View Record</a></button>\n");
      out.write("            <button class =\"btn btn3\">Update Record</button>\n");
      out.write("            <button class =\"btn btn4\"><a href=\"deleteadmin.jsp\">Delete Record</a></button>\n");
      out.write("        </div>\n");
      out.write("        <form class=\"log\" action=\"viewbus\" method=\"post\">\n");
      out.write("                <input type=\"text\" placeholder=\"Bus-Id\" name=\"busid\">\n");
      out.write("                <input type=\"text\" placeholder=\"Driver-Id\" name=\"driverid\">\n");
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
