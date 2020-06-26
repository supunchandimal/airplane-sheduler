
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class registeraircrafts {
     
    public static boolean registeraircrafts(aircrafts aircraft)
    {
        boolean status=true;
        Connection con = null;
        GetConnection getconnection = new GetConnection();
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con  = getconnection.getCon();
            
            //insert to table users usign prepared statems .. this is the statndare way
            String query = "insert into aircrafts  (registrationid,name, seats )"+ " values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            
            // query string "?" marks initializing name to 1 st question mark and ? is set to user.name
            ps.setString(1,aircraft.getRegistrationid());
            ps.setString(2, aircraft.getName());
            ps.setString(3,aircraft.getSeats());
           
            status = ps.execute();
          
            
            
        }catch(Exception e){
            System.out.println("Exception in register model" +e);
        }
        //if succsess full registration returns flase and unsuccessfull one returns true
        return status;        
    }
    
 public static boolean validateid(String id  ){
        aircrafts aircraft= null;
        Connection con = null;
        boolean status=true ;
        
        
        GetConnection getconnection = new GetConnection();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = getconnection.getCon();
            Statement stmt= con.createStatement();
            String Query = "SELECT * FROM aircrafts where registrationid = '" +id +"' AND delornot = 1" ;
            ResultSet rs = stmt.executeQuery(Query);
           
         
           
            if(rs.next()){
                status = true ;
                System.out.println("puka");
                
            }else{
                status = false;
            }
                  
            
           
            
        
        }catch(Exception e){
            System.out.println("Excetpion in  "+ e);
        }
        
        
        return status;
    }
     
     
}
