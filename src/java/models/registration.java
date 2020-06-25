
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class registration {
    
    public static boolean register(users user)
    {
        boolean status=true;
        Connection con = null;
        GetConnection getconnection = new GetConnection();
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con  = getconnection.getCon();
            
            //insert to table users usign prepared statems .. this is the statndare way
            String query = "insert into users  (name, phone, password , email , role)"+ " values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            
            // query string "?" marks initializing name to 1 st question mark and ? is set to user.name
            ps.setString(1,user.getName());
            ps.setString(2, user.getPhone());
            ps.setString(3,user.getPassword());
            ps.setString(4,user.getEmail());
            ps.setString(5, user.getRole());
            status = ps.execute();
          
            
            
        }catch(Exception e){
            System.out.println("Exception in register model" +e);
        }
        //if succsess full registration returns flase and unsuccessfull one returns true
        return status;        
    }
}
