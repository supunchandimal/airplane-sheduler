
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
        aircrafts aircraft = new aircrafts();
        aircraft.setName(request.getParameter("name"));
        aircraft.setRegistrationid(request.getParameter("registrationid"));
        aircraft.setSeats(request.getParameter("seats"));
        
        registeraircrafts register = new registeraircrafts();
        
        boolean status;
        
       status = register.registeraircrafts(aircraft);
       
        System.out.println(status);
       
        if(status == false){
            request.setAttribute("succesornot",1);
            
            request.getRequestDispatcher("adminpage.jsp").forward(request, response);
                    
        }else{
            request.setAttribute("succesornot",0);
            request.getRequestDispatcher("adminpage.jsp").forward(request, response);
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**i
     * Returns a short description of the servlet.
     *
     * @r/**i
     * Returns a short description of the servlet.
     *
     * @eturn a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
