package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.bus;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class viewrecordbus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("               <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("               <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                margin:0;\n");
      out.write("            }\n");
      out.write("            body \n");
      out.write("            {\n");
      out.write("                background-image: url(\"v1.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("             .header \n");
      out.write("          {\n");
      out.write("              height: 100px;\n");
      out.write("              background-color: red;\n");
      out.write("              color: white;\n");
      out.write("              font-size: 20px;\n");
      out.write("              width: 100px;\n");
      out.write("              position: relative;\n");
      out.write("              left: 330px;\n");
      out.write("              top: 50px;\n");
      out.write("              flex-wrap: wrap;\n");
      out.write("              border: 3px solid white;\n");
      out.write("              box-shadow: 10px 10px 10px white;\n");
      out.write("          }\n");
      out.write("         .main\n");
      out.write("         {\n");
      out.write("             height: 200px;\n");
      out.write("             display: flex;\n");
      out.write("             border: 2px solid black;\n");
      out.write("             flex-wrap: wrap;\n");
      out.write("         }\n");
      out.write("         #customers {\n");
      out.write("    font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 90%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers td, #customers th {\n");
      out.write("    border: 3px solid black;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers tr:nth-child(even){background-color: white;}\n");
      out.write("\n");
      out.write("#customers tr:hover {background-color: #303952;color: white;}\n");
      out.write("\n");
      out.write("#customers th {\n");
      out.write("    padding-top: 12px;\n");
      out.write("    padding-bottom: 12px;\n");
      out.write("    text-align: left;\n");
      out.write("    background-color: dodgerblue;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write(".head \n");
      out.write("{\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\talign-items: center;\n");
      out.write("\tbackground-color:rgba(38,101,201,0.45);\n");
      out.write("\tcolor:white;\n");
      out.write("\tfont-size: 45px;\n");
      out.write("\theight: 100px;\n");
      out.write("\tpadding: 5px;\n");
      out.write("}\n");
      out.write("    .table td, .table th {\n");
      out.write("    padding: 1rem;\n");
      out.write("    vertical-align: top;\n");
      out.write("    border-top: 1px solid #fefefe;\n");
      out.write("    }\n");
      out.write(".table-dark td\n");
      out.write("{\n");
      out.write("    border-color:#fefefe;\n");
      out.write("}\n");
      out.write(".table-dark\n");
      out.write("{\n");
      out.write("    background-color:rgba(46, 134, 222,0.5);\n");
      out.write("}\n");
      out.write("i\n");
      out.write("{\n");
      out.write("  position: absolute;\n");
      out.write("  top: 30px;\n");
      out.write("  right: 40px;\n");
      out.write("  height: 100px;\n");
      out.write("}\n");
      out.write("         </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"head\">\n");
      out.write("             <b>Bus Record Details</b>\n");
      out.write("             <a href=\"userServlet1\"> <i class=\"fa fa-backward\" style=\"font-size:48px;color:#dcdde1\"></i></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"cont\">\n");
      out.write("            <table class=\"table table-dark table-hover\">\n");
      out.write("<tr>\n");
      out.write("    <th><B>Bus ID</b></th>\n");
      out.write("    <th><B>Driver ID</b></th>\n");
      out.write("    <th><b>Driver Name</b></th>\n");
      out.write("    <th><b>Driver Contact</b></th>\n");
      out.write("    <th><b>Departure From</b></th>\n");
      out.write("    <th><b>Arrival At</b></th>\n");
      out.write("    <th><B>Arrival Time</b></th>\n");
      out.write("    \n");
      out.write("</tr>\n");

   List<bus> records =  (List<bus>)request.getAttribute("list");   
   for(bus s: records)
   {

     

      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>");
      out.print(s.getBId());
      out.write("</td>\n");
      out.write("<td>");
      out.print(s.getDId());
      out.write("</td>\n");
      out.write("<td>");
      out.print(s.getName());
      out.write("</td>\n");
      out.write("<td>");
      out.print(s.getContact());
      out.write("</td>\n");
      out.write("<td>");
      out.print(s.getDeparture());
      out.write("</td>\n");
      out.write("<td>");
      out.print(s.getArival());
      out.write("</td>\n");
      out.write("<td>");
      out.print(s.getTime());
      out.write("</td>\n");
      out.write("</tr>\n");

}

      out.write("\n");
      out.write("</table>\n");
      out.write("            \n");
      out.write("            \n");
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
