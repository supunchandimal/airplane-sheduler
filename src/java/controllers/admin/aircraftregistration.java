
package controllers.admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.aircrafts;
import models.registeraircrafts;


@WebServlet(name = "aircraftregistration", urlPatterns = {"/aircraftregistration"})
public class aircraftregistration extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
        
        
        
        //takes the parameters from the form and assing to a new user
        aircrafts aircraft = new aircrafts();
        aircraft.setName(request.getParameter("name"));
        aircraft.setRegistrationid(request.getParameter("registrationid"));
        aircraft.setSeats(request.getParameter("seats"));
        
        registeraircrafts register = new registeraircrafts();
        
        boolean validate = register.validateid(aircraft.getRegistrationid());
        if(!validate){
        
        
        boolean status;
        // creat a new aircraftregistration instance and add aircraft to the database
         status = register.registeraircrafts(aircraft);
       
        System.out.println(status);
        
        
       
        if(status == false){
            //if status fallse succesfully added to the database  if it is true .... fucked
            request.setAttribute("succesornot",1);
            
            request.getRequestDispatcher("aircraftcontroller").forward(request, response);
                    
        }else{
            request.setAttribute("succesornot",0);
            request.getRequestDispatcher("aircraftcontroller").forward(request, response);
        }
        }else{
            request.getRequestDispatcher("aircraftcontroller").forward(request, response);
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
