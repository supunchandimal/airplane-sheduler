
package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public class login {
    public static users getlogin(String email, String password ){
        users user= null;
        Connection con = null;
        
        GetConnection getconnection = new GetConnection();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = getconnection.getCon();
            Statement stmt= con.createStatement();
            String Query = "SELECT * FROM users where email = '" + email+"' AND password = '"+password+"'";
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();// result set first showing the start of the tabe to and we should go to actual result 
            if(rs.next()){
                //if  user is valid then assing to the user and send user credential 
                    user = new users();
                    user.setUserid(rs.getString("userid"));
                    user.setName(rs.getString("name"));
                    user.setPhone(rs.getString("phone"));
                    user.setEmail(rs.getString("email"));
                    user.setPassword(rs.getString("password"));
                    user.setRole(rs.getString("role"));
                    System.out.println(user.getName());
                    System.out.println(user.getRole());
            }
            
           
        
        }catch(Exception e){
            System.out.println("Excetpion in  "+ e);
        }
        
        
        return user;
    }
    
}
