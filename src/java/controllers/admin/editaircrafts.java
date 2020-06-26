
package controllers.admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.aircrafts;
import models.updateanddeleteaircrafts;


@WebServlet(name = "editaircrafts", urlPatterns = {"/editaircrafts"})
public class editaircrafts extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        int editid = Integer.parseInt(request.getParameter("id"));
        int state = Integer.parseInt(request.getParameter("state"));
        updateanddeleteaircrafts service = new updateanddeleteaircrafts();
        aircrafts aircraft = new aircrafts();
        
        if(state==1){
            //if status == 1 then load the data of the aircraft
            aircraft  =service.getdata(editid);
            request.setAttribute("aircraft",aircraft);
            request.getRequestDispatcher("editaircrafts.jsp").forward(request, response);
                    
        }else if(state==2){
            
            //if status == 2 then update the aircraft
            aircraft.setAircraftid(request.getParameter("id"));
            aircraft.setRegistrationid(request.getParameter("registrationid"));
            aircraft.setName(request.getParameter("name"));
            aircraft.setSeats(request.getParameter("seats"));
     
            boolean status = service.update(aircraft);
            
            //statsu == false then successfully updated
            
            
            if(status == false){
                request.getRequestDispatcher("aircraftcontroller").forward(request, response);
            }
                      
        }else if(state==3){
             
           //if status == 3 then we update the delor not columen we are not deleting jiust mark as dleted it is better way 
            
            boolean status = service.delete(Integer.parseInt(request.getParameter("id")));
            
            //status== false then successfully deleted

            if(status == false){
                request.getRequestDispatcher("aircraftcontroller").forward(request, response);
            }
          
        }
       
        
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
