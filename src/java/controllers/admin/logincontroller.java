
package controllers.admin;
import models.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.users;


@WebServlet(name = "logincontroller", urlPatterns = {"/logincontroller"})
public class logincontroller extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("login controller d");
        String email ;
        String password;
        login login = new login();
        users user =new users();
         HttpSession session=request.getSession(); 
        email= request.getParameter("email");
        password = request.getParameter("password");
        System.out.println(email);
        user = login.getlogin(email, password);
        
        if(user!=null){
            
        if(user.getRole().equals("admin")){
            session.setAttribute("userid",001);  
            session.setAttribute("name", "admin");
            //send redirect  request and response to  aicrft controller 
            response.sendRedirect("aircraftcontroller");
        //
        }if(user.getRole().equals("customer")){
            //System.out.println("customer");
            
            
            session.setAttribute("userid",user.getUserid());  
            session.setAttribute("name", user.getName());
            
            //send redirect requst and response to customer controller 
            response.sendRedirect("loadflight");
            //request.getRequestDispatcher("loadflight").forward(request, response);
        }
        }else{
            
            // send again to login pagee
             System.out.println("invlaid");
             String s = "email or passwrod incorrect";
             request.setAttribute("loginError",s);
            
             System.out.println(request.getAttribute("loginError"));
           request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        
            
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
