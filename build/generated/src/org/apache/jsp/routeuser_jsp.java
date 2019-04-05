package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class routeuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Route user</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/bulma@0.7.4/css/bulma.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"login.css\">\n");
      out.write("    <style>\n");
      out.write("        .hero.is-success {\n");
      out.write("         background: url(\"v3.jpg\") no-repeat;\n");
      out.write("         background-size: cover;\n");
      out.write("}\n");
      out.write(".cont\n");
      out.write("{\n");
      out.write("    text-align:center;\n");
      out.write("    position:absolute;\n");
      out.write("    top:2%;\n");
      out.write("    left:50%;\n");
      out.write("    transform:translate(-50%,-50%);\n");
      out.write("    width:120%;\n");
      out.write("}\n");
      out.write(".cont span\n");
      out.write("{\n");
      out.write("    color:white;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    display:block;\n");
      out.write("}\n");
      out.write(".text1\n");
      out.write("{\n");
      out.write("    font-size:60px;\n");
      out.write("    font-weight: 700;\n");
      out.write("    letter-spacing: 8px;\n");
      out.write("    margin-bottom: 41px;\n");
      out.write("    position: relative;\n");
      out.write("    animation: text 3s 1;\n");
      out.write("    background-color:rgba(0,0,0,0.4);\n");
      out.write("}\n");
      out.write("@keyframes text\n");
      out.write("{\n");
      out.write("    0%\n");
      out.write("    {\n");
      out.write("        color:black;\n");
      out.write("        margin-bottom:-40px;\n");
      out.write("    }\n");
      out.write("    30%\n");
      out.write("    {\n");
      out.write("        letter-spacing:25px;\n");
      out.write("        margin-bottom:-40px;\n");
      out.write("    }\n");
      out.write("    85%\n");
      out.write("    {\n");
      out.write("        letter-spacing:8px;\n");
      out.write("        margin-bottom: -40px;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write(".box {\n");
      out.write("  margin-top: 5rem;\n");
      out.write("  border-radius:15px;\n");
      out.write("  background-color:rgba(192,192,192,0.3);\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <section class=\"hero is-success is-fullheight\">\n");
      out.write("        <div class=\"hero-body\">\n");
      out.write("            <div class=\"container has-text-centered\">\n");
      out.write("                <div class=\"column is-4 is-offset-4\">\n");
      out.write("                    <div class=\"cont\">\n");
      out.write("                        <span class=\"text1\">Create Routes</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <form name=\"MyForm\" action=\"routeServlet\" method=\"post\" onsubmit=\"return myValidation()\">\n");
      out.write("                            <div class=\"field\">\n");
      out.write("                                <div class=\"control\">\n");
      out.write("                                    <input class=\"input is-large\" type=\"text\" placeholder=\"Route Code\" name=\"rc\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field\">\n");
      out.write("                                <div class=\"control\">\n");
      out.write("                                    <input class=\"input is-large\" type=\"text\" placeholder=\"Route Name\" name=\"rn\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field\">\n");
      out.write("                                <div class=\"control\">\n");
      out.write("                                    <input class=\"input is-large\" type=\"text\" placeholder=\"Pick-Up Points\" name=\"pp\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field\">\n");
      out.write("                                <div class=\"control\">\n");
      out.write("                                    <input class=\"input is-large\" type=\"text\" placeholder=\"Driver Name\" name=\"dn\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field\">\n");
      out.write("                                <div class=\"control\">\n");
      out.write("                                    <input class=\"input is-large\" type=\"text\" placeholder=\"Destination\" name=\"des\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field\">\n");
      out.write("                                <div class=\"control\">\n");
      out.write("                                    <input class=\"input is-large\" type=\"text\" placeholder=\"Time\" name=\"time\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <button class=\"button is-block is-info is-large is-fullwidth\">Create</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <script async type=\"text/javascript\" src=\"bulma.js\"></script>\n");
      out.write("     <script>\n");
      out.write("\tfunction myValidation()\n");
      out.write("\t{\n");
      out.write("\t\tvar value = document.forms[\"MyForm\"][\"rc\"].value;\n");
      out.write("\t\tvar value2 = document.forms[\"MyForm\"][\"rn\"].value;\n");
      out.write("                var value3 = document.forms[\"MyForm\"][\"pp\"].value;\n");
      out.write("                var value4 = document.forms[\"MyForm\"][\"dn\"].value;\n");
      out.write("                var value5 = document.forms[\"MyForm\"][\"des\"].value;\n");
      out.write("                var value6 = document.forms[\"MyForm\"][\"time\"].value;\n");
      out.write("\t\tvar flag=true;\n");
      out.write("\t\tif (value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Route Code cannot be empty\");\n");
      out.write("\t\t\tflag=false;\n");
      out.write("\t\t}\n");
      out.write("\t\tif (value2==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Route Name cannot be empty\");\n");
      out.write("\t\t\tflag=false;\n");
      out.write("\t\t}\n");
      out.write("                if (value3==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Pick-Up Point cannot be empty\");\n");
      out.write("\t\t\tflag=false;\n");
      out.write("\t\t}\n");
      out.write("                if (value4==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Driver Name cannot be empty\");\n");
      out.write("\t\t\tflag=false;\n");
      out.write("\t\t}\n");
      out.write("                if (value5==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Destination cannot be empty\");\n");
      out.write("\t\t\tflag=false;\n");
      out.write("\t\t}\n");
      out.write("                if (value6==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Time cannot be empty\");\n");
      out.write("\t\t\tflag=false;\n");
      out.write("\t\t}\n");
      out.write("\t\treturn flag;\n");
      out.write("\t}\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>");
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