package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class scheduleuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("    body\n");
      out.write("    {\n");
      out.write("        background-color: rgba(83, 92, 104,1.0);\n");
      out.write("    }\n");
      out.write("table {\n");
      out.write("  font-family: arial, sans-serif;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("  border: 1px solid #dddddd;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("  background-color: #dddddd;\n");
      out.write("}\n");
      out.write("i\n");
      out.write("{\n");
      out.write("  position: absolute;\n");
      out.write("  top: 15px;\n");
      out.write("  right: 40px;\n");
      out.write("  height: 100px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>Driver Info/Schedule Info</h1>\n");
      out.write("<a href=\"user.jsp\"><i class=\"fa fa-backward\" style=\"font-size:48px;color:black\"></i></a>\n");
      out.write("<table>\n");
      out.write("  <tr>\n");
      out.write("    <th>Serial No.</th>\n");
      out.write("    <th>Driver Name</th>\n");
      out.write("    <th>Driver Contact</th>\n");
      out.write("    <th>Bus No.</th>\n");
      out.write("    <th>Bus Stand</th>\n");
      out.write("    <th>Arrival Time</th>\n");
      out.write("    <th>Departure Time</th>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>1</td>\n");
      out.write("    <td>Gurmohan Singh</td>\n");
      out.write("    <td>7508477544</td>\n");
      out.write("    <td>Pb03S 4992</td>\n");
      out.write("    <td>Zirakpur</td>\n");
      out.write("    <td>7:30 A.M.</td>\n");
      out.write("    <td>8:45 A.M.</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>2</td>\n");
      out.write("    <td>Sanju Samson</td>\n");
      out.write("    <td>9988392669</td>\n");
      out.write("    <td>HR03S 6369</td>\n");
      out.write("    <td>Panchkula</td>\n");
      out.write("    <td>8:00 A.M.</td>\n");
      out.write("    <td>8:45 A.M.</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("   <td>3</td>\n");
      out.write("    <td>Gurmeet Singh</td>\n");
      out.write("    <td>9878709669</td>\n");
      out.write("    <td>PB02M 7887</td>\n");
      out.write("    <td>Mohali</td>\n");
      out.write("    <td>7:30 A.M.</td>\n");
      out.write("    <td>8:45 A.M.</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("   <td>4</td>\n");
      out.write("    <td>Harkirat Singh</td>\n");
      out.write("    <td>9988425667</td>\n");
      out.write("    <td>CH02S 5449</td>\n");
      out.write("    <td>Chandigarh</td>\n");
      out.write("    <td>7:30 A.M.</td>\n");
      out.write("    <td>8:45 A.M.</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("   <td>5</td>\n");
      out.write("    <td>Rajkishan Singh</td>\n");
      out.write("    <td>9555947950</td>\n");
      out.write("    <td>HP04L 8771</td>\n");
      out.write("    <td>Baddi</td>\n");
      out.write("    <td>8:15 A.M.</td>\n");
      out.write("    <td>8:45 A.M.</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>6</td>\n");
      out.write("    <td>Ram Ankit</td>\n");
      out.write("    <td>7888994829</td>\n");
      out.write("    <td>HR09A 2336</td>\n");
      out.write("    <td>Kalka</td>\n");
      out.write("    <td>8:15 A.M.</td>\n");
      out.write("    <td>8:45 A.M.</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
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
