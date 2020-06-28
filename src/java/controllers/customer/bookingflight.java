/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.customer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.bookingticket;


@WebServlet(name = "bookingflight", urlPatterns = {"/bookingflight"})
public class bookingflight extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       int dbid = Integer.parseInt(request.getParameter("dbid"));
       int availabelseats = Integer.parseInt(request.getParameter("availabelseats"));
       
       if(availabelseats==0){
           String  s = "All seats are full !";
           request.setAttribute("bookingmsg", s);
           request.getRequestDispatcher("loadflight").forward(request, response);
       }else{
           
           bookingticket book = new bookingticket();
           book.book(dbid);
           
           String s = "Booked";
           request.setAttribute("bookingmsg", s);
             request.getRequestDispatcher("loadflight").forward(request, response);
       }
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
