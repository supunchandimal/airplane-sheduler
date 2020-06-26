
package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class aircraftloader {
    
    
      
    public  List<aircrafts> loadaircrafts()
    {
        List<aircrafts> arry = new ArrayList<>();
                
        Connection con = null;
        GetConnection getconnection = new GetConnection();
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con  = getconnection.getCon();
            
           
            String query = "Select * from aircrafts where delornot=1";
            
            Statement statement = con.createStatement();
            ResultSet resultset = statement.executeQuery(query);
       
            
            while(resultset.next()){
                aircrafts a = new aircrafts();
                a.setAircraftid(resultset.getString("aircraftid"));
                a.setName(resultset.getString("name"));
                a.setRegistrationid(resultset.getString("registrationid"));
                a.setSeats(resultset.getString("seats"));
                
                
                arry.add(a);
            }
          
            
            
        }catch(Exception e){
            System.out.println("Exception in register model" +e);
        }
        //if succsess full registration returns flase and unsuccessfull one returns true
        return arry;        
    }
    
}
