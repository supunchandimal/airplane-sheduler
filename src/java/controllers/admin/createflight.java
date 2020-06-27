
package controllers.admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.flight;
import models.flightshedule;


@WebServlet(name = "createflight", urlPatterns = {"/createflight"})
public class createflight extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           flight flight = new flight();
           
           flight.setFlightNo(request.getParameter("flightid"));
           flight.setAridate(request.getParameter("aridate"));
           flight.setAritime(request.getParameter("aritime"));
           flight.setDepdate(request.getParameter("depdate"));
           flight.setDeptime(request.getParameter("deptime"));
           flight.setCost(request.getParameter("cost"));
           flight.setDepairport(request.getParameter("dep"));
           flight.setAriairport(request.getParameter("ari"));
         
           
//           
//           System.out.println(flight.getFlightNo());
//           System.out.println(flight.getAridate());
//           System.out.println(flight.getAritime());
//           System.out.println(flight.getDepdate());
//           System.out.println(flight.getDeptime());
//           System.out.println(flight.getCost());
//           System.out.println(flight.getDepairport());
//           System.out.println(flight.getAriairport());
           
           flightshedule shedule = new flightshedule();
           shedule.makeflight(flight);
           
           request.getRequestDispatcher("flightsheduleloader").forward(request, response);
           
      
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
