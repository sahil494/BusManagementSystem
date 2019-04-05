package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.deletebus;
import model.deletebusDao;

public class Deletebus extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); 
        String bid = request.getParameter("bid");
        String did = request.getParameter("did");
        String dname = request.getParameter("dname");
        deletebus d = new deletebus();
        d.setBId(bid);
        d.setDId(did);
        d.setName(dname);
        
        deletebusDao dd = new deletebusDao();   

        
        if (dd.check1(d)) {
            HttpSession session = request.getSession();
            session.setAttribute("dname", dname);
              out.print("<script>alert('Your Bus Details has been Deleted'); setTimeout(function(){window.location='adminportal1.jsp'}, 1*1000);</script>");
         }
           else 
            {
            
             out.print("<script>alert('Sorry....Please Match Bus Details'); setTimeout(function(){window.location='deleteadmin.jsp'}, 1*1000);</script>");
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
