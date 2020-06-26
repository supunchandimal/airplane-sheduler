/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.aircraftloader;
import models.aircrafts;

@WebServlet(name = "aircraftcontroller", urlPatterns = {"/aircraftcontroller"})
public class aircraftcontroller extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        aircraftloader load = new  aircraftloader();
        List<aircrafts> aircraft = load.loadaircrafts();
        System.out.println(aircraft.isEmpty());
        
        aircrafts a = aircraft.get(0);
        System.out.println(a.getAircraftid());
        
        request.setAttribute("aicrafts", aircraft);
        
        request.getRequestDispatcher("adminpage.jsp").forward(request, response);
               
        
        
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
