
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

@WebServlet(name = "editflight", urlPatterns = {"/editflight"})
public class editflight extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        flightshedule flight = new flightshedule();
        int flightstatus= Integer.parseInt(request.getParameter("flightstatus")) ;
        int dbid= Integer.parseInt(request.getParameter("dbid")) ;
        if(flightstatus ==1){
            flight flightdata = new flight();
            flightdata= flight.flightdata(dbid);
           request.removeAttribute("dbid");
           request.removeAttribute("flightstatus");
           request.setAttribute("flightdata", flightdata);
           request.getRequestDispatcher("editflight.jsp").forward(request, response);
        }else if (flightstatus ==2){
            
            
            boolean status= flight.delete(dbid);
            request.removeAttribute("dbid");
            request.removeAttribute("flightstatus");
            request.getRequestDispatcher("flightsheduleloader").forward(request, response);
           
            
        } else if(flightstatus==3){
            
            flight update = new  flight();
             System.out.println("fuck");
           update.setFlightNo(request.getParameter("flightid"));
           update.setAridate(request.getParameter("aridate"));
           update.setAritime(request.getParameter("aritime"));
           update.setDepdate(request.getParameter("depdate"));
           update.setDeptime(request.getParameter("deptime"));
           update.setCost(request.getParameter("cost"));
           update.setDepairport(request.getParameter("dep"));
           update.setAriairport(request.getParameter("ari"));
           update.setDbno(request.getParameter("dbid"));
        
          boolean status=  flight.update(update);
            if(status == false){
            request.removeAttribute("dbid");
            request.removeAttribute("flightstatus");
            request.getRequestDispatcher("flightsheduleloader").forward(request, response); 
            }
            
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
