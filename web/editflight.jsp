
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/admin.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
              integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
           <link rel="stylesheet" href="assets/adminpage.css">
        <title>admin dashboard</title>
    </head>
    <body>
        <!-- Side navigation -->
       <div class="sidenav">
             <a href="aircraftcontroller">Air crafts</a>
             <a href="flightsheduleloader">Shedule</a>

       </div>

       <!-- Page content -->
       <div class="main">
           <div class=" formcon1 container w-75" >
               <h1 id="topic"> Update Flight shedule </h1>
               <form action="editflight" method="get">
               
                <div class="form-row">
                  <div class="form-group col-md-2">
                    <label for="flightid">Flight No </label>
                    <input type="text" class="form-control" id="flightid" name="flightid" required="fill this" value="<c:out value="${flightdata.flightNo}"></c:out>"  >
                    
                  </div>
                  <div class="form-group col-md-2">
                    <label for="depdate">Depater Date</label>
                    <input type="date" class="form-control" id="depdate" name="depdate" required="requird" value="<c:out value="${flightdata.depdate}"></c:out>">
                  </div>
                  <div class="form-group col-md-2">
                    <label for="deptime">Depater Time</label>
                    <input type="time" class="form-control" id="deptime" name="deptime" required="required" value="<c:out value="${flightdata.deptime}"></c:out>">
                  </div>
                     <div class="form-group col-md-2">
                    <label for="aridate">Arival Date</label>
                    <input type="date" class="form-control" id="aridate" name="aridate" required="required" value="<c:out value="${flightdata.aridate}"></c:out>">
                  </div>
                    
                     <div class="form-group col-md-2">
                    <label for="aritime">Arrival Time</label>
                    <input type="time" class="form-control" id="aritime" name="aritime"   required=""value="<c:out value="${flightdata.aritime}"></c:out>">
                  </div>
                     <div class="form-group col-md-2">
                    <label for="cost">Per Person Cost</label>
                    <input type="text" class="form-control" id="cost" name="cost" requiredv value="<c:out value="${flightdata.cost}"></c:out>" >
                  </div>
                    <input value="A" hidden="" name="dep" id="dep">
                    <input value="B" hidden="" name="ari" id="ari">
                    <input value="<c:out value="${flightdata.dbno}"></c:out>" name ="dbid" id="dbid" hidden="">
                    <input value=3 hidden="" name="flightstatus"  id="flightstatus" >
                </div>
               
                <button type="submit" class="btn btn-primary">Make a flight</button>
             </form>
           </div>

           
           
         
       </div> 
    </body>
</html>
