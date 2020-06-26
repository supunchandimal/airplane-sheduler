
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class updateanddeleteaircrafts {
    
     public static aircrafts getdata(int id  ){
        aircrafts aircraft= null;
        Connection con = null;
        
        GetConnection getconnection = new GetConnection();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = getconnection.getCon();
            Statement stmt= con.createStatement();
            String Query = "SELECT * FROM aircrafts where aircraftid = '" +id+"'";
            ResultSet rs = stmt.executeQuery(Query);
            System.out.println("here");
            rs.next();// result set first showing the start of the tabe to and we should go to actual result 
           
                //if  user is valid then assing to the user and send user credential 
                    aircraft = new aircrafts();
                            
                    aircraft.setAircraftid(rs.getString("aircraftid"));
                    System.out.println(rs.getString("aircraftid"));
                    aircraft.setName(rs.getString("name"));
                    aircraft.setSeats(rs.getString("seats"));
                    aircraft.setRegistrationid(rs.getString("registrationid"));
                  
            
           
            
                    
        
        }catch(Exception e){
            System.out.println("Excetpion in  "+ e);
        }
        
        
        return aircraft;
    }
     
     
      public static boolean  update( aircrafts aircraft  ){
        boolean status = true;
        Connection con = null;
        
        GetConnection getconnection = new GetConnection();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = getconnection.getCon();
           	String query = "UPDATE aircrafts  SET    name = ?, seats = ? WHERE aircraftid = ?";
                PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1,aircraft.getName());
			ps.setString(2,aircraft.getSeats());
			ps.setString(3,aircraft.getAircraftid() );
			status= ps.execute();
            
           
        
        }catch(Exception e){
            System.out.println("Excetpion in  "+ e);
        }
        
        
        return  status;
    }
      
      
       public static boolean  delete( int i  ){
        boolean status = true;
        Connection con = null;
        
        GetConnection getconnection = new GetConnection();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = getconnection.getCon();
           	String query = "UPDATE aircrafts  SET    delornot  =?  WHERE aircraftid = ?";
                PreparedStatement ps= con.prepareStatement(query);
			ps.setInt(1,0);
			ps.setInt(2,i);
			status= ps.execute();
            
           
        
        }catch(Exception e){
            System.out.println("Excetpion in  "+ e);
        }
        
        
        return  status;
    }
    
}
