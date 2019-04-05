package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminportal1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Admin Panel</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"admincss.css\">\n");
      out.write("<style> \n");
      out.write(".head\n");
      out.write("{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop:-100px;\n");
      out.write("\tleft:500px;\n");
      out.write("\tanimation-name:ani1;\n");
      out.write("\tanimation-duration: 4s;\n");
      out.write("\tanimation-fill-mode: forwards;\n");
      out.write("}\n");
      out.write("@keyframes ani1\n");
      out.write("{\n");
      out.write("\t0%\n");
      out.write("\t{\n");
      out.write("\t\ttop: -100px;\n");
      out.write("\t}\n");
      out.write("\t100%\n");
      out.write("\t{\n");
      out.write("\t\ttop: 200px;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("h1\n");
      out.write("{\n");
      out.write("    font-size:40px;\n");
      out.write("    font-weight: 700;\n");
      out.write("    letter-spacing: 8px;\n");
      out.write("    color:white;\n");
      out.write("    line-height: 20px;\n");
      out.write("    text-shadow: 0 2px white, 0 3px #777;\n");
      out.write("    margin: 1em 0 0.5em 0;\n");
      out.write("}\n");
      out.write(".container-fluid a {\n");
      out.write("\tcolor: rgba(0,0,0,0.5);\n");
      out.write("\tfont-weight: 700;\n");
      out.write("\ttext-shadow: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"flex-container\">\n");
      out.write("<section class=\"sidebar text-center\">\n");
      out.write("<ul class=\"container-fluid\">\n");
      out.write("<li><a href=\"createadminbus.jsp\">Create Bus </a></li>\n");
      out.write("<li><a href=\"routeuser.jsp\">Create Routes</a></li>\n");
      out.write("<li><a href=\"viewBus\">View Bus</a></li>\n");
      out.write("<li><a href=\"viewRouteServlet\">View Routes</a></li>\n");
      out.write("<li><a href=\"driverinfo.jsp\">Driver Info</a></li>\n");
      out.write("<li><a href=\"deleteadmin.jsp\">Delete Bus</a></li>\n");
      out.write("<li><a href=\"deleteroute.jsp\">Delete Routes</a></li>\n");
      out.write("<li><a href=\"LogoutServlet\">Logout</a></li>\n");
      out.write("</ul>\n");
      out.write("</section>\n");
      out.write("<h1 class=\"head\">Welcome to Admin Portal</h1>\n");
      out.write("</div>\n");
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
