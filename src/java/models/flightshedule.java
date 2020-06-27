/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class flightshedule {
    
    
    public boolean makeflight(flight flight){
        
        boolean status=true;
        Connection con = null;
        GetConnection getconnection = new GetConnection();
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con  = getconnection.getCon();
            
            String query = "insert into flightshedule  ( flightno,depdate,deptime,aridate,aritime,depairport,ariairport,cost )"+ " values(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
                    
  
            ps.setString(1,flight.getFlightNo());
            ps.setString(2, flight.getDepdate());
            ps.setString(3,flight.getDeptime());
            ps.setString(4, flight.getAridate());
            ps.setString(5, flight.getAritime());
            ps.setString(6, flight.getDepairport());
            ps.setString(7, flight.getAriairport());
            ps.setString(8, flight.getCost());
            status = ps.execute();
          
            
            
        }catch(Exception e){
            System.out.println("Exception in register model" +e);
        }
       
        return status;
    }
    
      
      
    public  List<flight> loadaircrafts()
    {
        List<flight> arry = new ArrayList<>();
                
        Connection con = null;
        GetConnection getconnection = new GetConnection();
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con  = getconnection.getCon();
            
           
            String query = "Select * from flightshedule where delornot=1";
            
            Statement statement = con.createStatement();
            ResultSet resultset = statement.executeQuery(query);
       
            
            while(resultset.next()){
                flight a  = new flight();
                a.setDbno(resultset.getString("dbno"));
                a.setFlightNo(resultset.getString("flightno"));
                a.setDepdate(resultset.getString("depdate"));
                a.setDeptime(resultset.getString("deptime"));
                a.setAridate(resultset.getString("aridate"));
                a.setAritime(resultset.getString("aritime"));
                a.setDepairport(resultset.getString("depairport"));
                a.setAriairport(resultset.getString("ariairport"));
                a.setCost(resultset.getString("cost"));
                
                
                arry.add(a);
                
            }
          
            
            
        }catch(Exception e){
            System.out.println("Exception in register model" +e);
        }
        //if succsess full registration returns flase and unsuccessfull one returns true
        return arry;        
    }
    

            
     public static flight flightdata(int id  ){
        flight a= null;
        Connection con = null;
        
        GetConnection getconnection = new GetConnection();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = getconnection.getCon();
            Statement stmt= con.createStatement();
            String Query = "SELECT * FROM flightshedule where dbno = '" +id+"'";
            ResultSet resultset = stmt.executeQuery(Query);
            System.out.println("here");
            resultset.next();
                a = new flight();
                a.setDbno(resultset.getString("dbno"));
                a.setFlightNo(resultset.getString("flightno"));
                a.setDepdate(resultset.getString("depdate"));
                a.setDeptime(resultset.getString("deptime"));
                a.setAridate(resultset.getString("aridate"));
                a.setAritime(resultset.getString("aritime"));
                a.setDepairport(resultset.getString("depairport"));
                a.setAriairport(resultset.getString("ariairport"));
                a.setCost(resultset.getString("cost"));  
                    
        
        }catch(Exception e){
            System.out.println("Excetpion in  "+ e);
        }
        
        
        return a;
    }


public static boolean  delete( int i  ){
        boolean status = true;
        Connection con = null;
        
        GetConnection getconnection = new GetConnection();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = getconnection.getCon();
           	String query = "UPDATE flightshedule  SET    delornot  =?  WHERE dbno= ?";
                PreparedStatement ps= con.prepareStatement(query);
			ps.setInt(1,0);
			ps.setInt(2,i);
			status= ps.execute();
            
           
        
        }catch(Exception e){
            System.out.println("Excetpion in  "+ e);
        }
        
        
        return  status;
    }


  public static boolean  update( flight flight  ){
        boolean status = true;
        Connection con = null;
        
        GetConnection getconnection = new GetConnection();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = getconnection.getCon();
            String query = "update flightshedule set    flightno=? ,depdate=? ,deptime=?,aridate=? ,aritime=? ,depairport=?  ,ariairport=?,cost=? where dbno = ?" ;
            PreparedStatement ps = con.prepareStatement(query);
                    
  
            ps.setString(1,flight.getFlightNo());
            ps.setString(2, flight.getDepdate());
            ps.setString(3,flight.getDeptime());
            ps.setString(4, flight.getAridate());
            ps.setString(5, flight.getAritime());
            ps.setString(6, flight.getDepairport());
            ps.setString(7, flight.getAriairport());
            ps.setString(8, flight.getCost());
            ps.setString(9, flight.getDbno());
            status = ps.execute();
            
            System.out.println(status);
        
        }catch(Exception e){
            System.out.println("Excetpion in  "+ e);
        }
        
        
        return  status;
    }


}
