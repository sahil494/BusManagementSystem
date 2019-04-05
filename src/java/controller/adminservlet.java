package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.admin;
import model.adminDAO;
import model.user;
import model.userDAO;

public class adminservlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String email  = request.getParameter("email");
        String password  = request.getParameter("password");
        String status = request.getParameter("status");
        if (status.equals("Admin"))
        {
           admin a = new admin();
           a.setEmail(email);
           a.setPassword(password);
           adminDAO ad = new adminDAO();
           if(ad.check(a))
           {
               HttpSession session = request.getSession();
               session.setAttribute("email", email);
               RequestDispatcher rd = request.getRequestDispatcher("adminportal1.jsp");
               rd.forward(request,response);
           }
           else 
        {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('User or password incorrect');");
            out.println("location='index.html';");
            out.println("</script>");
        }
        }
        else if(status.equals("User"))
        {
           user u = new user();
           u.setEmail(email);
           u.setPassword(password);
           userDAO ad = new userDAO();
           System.out.println(ad.check(u));
           if(ad.check(u))
           {
               HttpSession session = request.getSession();
               session.setAttribute("email", email);
               RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
               rd.forward(request,response);
           }
           else 
           {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('User or password incorrect');");
            out.println("location='index.html';");
            out.println("</script>");
           }
        }
        else 
        {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('User or password incorrect');");
            out.println("location='index.html';");
            out.println("</script>");
        }
    }
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
