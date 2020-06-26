/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;

import java.sql.PreparedStatement;


public class flightshedule {
    
    
    public void makeflight(flight flight){
        
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
       
    }
    
}
