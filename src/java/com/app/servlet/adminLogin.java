/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
public class adminLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>OES</title>");            
            out.println("</head>");
            
            String email = request.getParameter("email");
            String pass = request.getParameter("pass");
            
            Connection conn = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            String driverName="com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/mini_project";
            String dbuser = "root";
            String dbpass = "parth";
            String sql = "select * from adminlog where email=? and password=?";
            
            String id = "";
            String emailid = "";
            
            try{
                if(email!=null){
                    
                    Class.forName(driverName);
                    conn=DriverManager.getConnection(url, dbuser, dbpass);
                    ps=conn.prepareStatement(sql);
                    ps.setString(1, email);
                    ps.setString(2, pass);
                    
                    rs=ps.executeQuery();
                    
                    if(rs.next()){
                        HttpSession hs = request.getSession();
                        hs.setAttribute("id", id);
                        hs.setAttribute("email", emailid);
                        RequestDispatcher rd = request.getRequestDispatcher("adminhomepage.jsp");
                        rd.forward(request, response);
                    }
                    else{
                        HttpSession hs = request.getSession();
                        RequestDispatcher d = request.getRequestDispatcher("adminlogin.jsp");
                        hs.setAttribute("err", "User Credentials Incorrect");
                        d.forward(request,response);
                        rs.close();
                        ps.close();
                    }
                }
                
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
        }
            catch(Exception e){
                e.printStackTrace();
            }
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
