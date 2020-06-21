
package models;
import java.sql.Connection;
import java.sql.DriverManager;


public class GetConnection {
    private String user= "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/plane";
    // conncet the data base in 3306 port if port  isnt 3306 errot
    
   
    
    public Connection getCon(){
        Connection con= null;
        try{
            con = DriverManager.getConnection(url, user, password);
            
        }catch(Exception e){
            System.out.println("connection Exceptino "+ e);
        }
        
        return con;
        
        //return the connection form the database.
    }
    
    
    
}
