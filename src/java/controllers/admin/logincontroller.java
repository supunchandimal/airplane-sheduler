
package controllers.admin;
import models.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.users;


@WebServlet(name = "logincontroller", urlPatterns = {"/logincontroller"})
public class logincontroller extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet logincontroller</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet logincontroller at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
        
        email= request.getParameter("email");
        password = request.getParameter("password");
        System.out.println(email);
        user = login.getlogin(email, password);
        
        if(user!=null){
        if(user.getRole().equals("admin")){
            System.out.println("admin----");
            //send redirect  request and response to  aicrft controller 
            response.sendRedirect("aircraftcontroller");
        //
        }if(user.getRole().equals("customer")){
            System.out.println("customer");
            //send redirect requst and response to customer controller 
            request.getRequestDispatcher("customerpage").forward(request, response);
        }
        }else{
            
            // send again to login pagee
             System.out.println("invlaid");
           request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        
            
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
