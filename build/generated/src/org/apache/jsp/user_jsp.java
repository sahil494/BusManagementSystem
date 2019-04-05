package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<title>User Panel</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"user1.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("    .container-fluid a {\n");
      out.write("\tcolor: rgba(0,0,0,0.5);\n");
      out.write("\tfont-weight: 700;\n");
      out.write("\ttext-shadow: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"flex-container\">\n");
      out.write("    <section class=\"sidebar text-center\">\n");
      out.write("    <ul class=\"container-fluid\">\n");
      out.write("    <li><a href=\"user.jsp\">Home</a></li>\n");
      out.write("    <li><a href=\"scheduleuser.jsp\">Schedule</a></li>\n");
      out.write("    <li><a href=\"viewRouteServlet\">Routes</a></li>\n");
      out.write("    <li><a href=\"LogoutUser\">Logout</a></li>\n");
      out.write("    </ul>\n");
      out.write("    </section>\n");
      out.write("    <section class=\"main text-center\">\n");
      out.write("    <section class=\"container text-center\">\n");
      out.write("    <h1 class=\"page-heading\">Search</h1>\n");
      out.write("    <form name=\"MyForm\" action=\"userServlet1\" method=\"post\" onsubmit=\"return myValidation()\">\n");
      out.write("    <div id=\"basic\">\n");
      out.write("    <input class=\"form-control\" type=\"text\" name=\"search\" placeholder=\"Route-Name\">\n");
      out.write("    </div>\n");
      out.write("    </form>\n");
      out.write("    </section>\n");
      out.write("    </section>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("\tfunction myValidation()\n");
      out.write("\t{\n");
      out.write("\t\tvar value = document.forms[\"MyForm\"][\"search\"].value;\n");
      out.write("\t\tvar flag=true;\n");
      out.write("\t\tif (value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Route-Code cannot be empty\");\n");
      out.write("\t\t\tflag=false;\n");
      out.write("\t\t}\n");
      out.write("\t\treturn flag;\n");
      out.write("\t}\n");
      out.write("\t</script>\n");
      out.write("    </body>\n");
      out.write("    </html>");
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
