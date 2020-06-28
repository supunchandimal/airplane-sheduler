
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class bookingticket {
    
  public static boolean  book( int dbid  ){
        boolean status = true;
        Connection con = null;
        
        
        GetConnection getconnection = new GetConnection();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = getconnection.getCon();
            System.out.println(dbid);
            String query1= "select * from flightshedule where dbno='"+dbid+"'";
            
            Statement stmt= con.createStatement();
            
            
            ResultSet rs = stmt.executeQuery(query1);
            rs.next();
            int seats = Integer.parseInt(rs.getString("availableseatcount"));
            
            seats = seats -1;
            System.out.println(seats); 
                    
                 
            
            String query = "update flightshedule set    availableseatcount=? where dbno = ?" ;
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, Integer.toString(seats));
            ps.setString(2, Integer.toString(dbid));
            
            status = ps.execute();
            
            System.out.println(status);
        
        }catch(Exception e){
            System.out.println("Excetpion in  "+ e);
        }
        
        
        return  status;
    }
}
