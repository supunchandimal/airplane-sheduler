

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
               <h1 id="topic">Flight shedule A to B </h1>
               <form action="createflight" method="get">
               
                <div class="form-row">
                  <div class="form-group col-md-2">
                    <label for="flightid">Flight No </label>
                    <input type="text" class="form-control" id="flightid" name="flightid" required="fill this" >
                    
                  </div>
                  <div class="form-group col-md-2">
                    <label for="depdate">Depater Date</label>
                    <input type="date" class="form-control" id="depdate" name="depdate" required="requird">
                  </div>
                  <div class="form-group col-md-2">
                    <label for="deptime">Depater Time</label>
                    <input type="time" class="form-control" id="deptime" name="deptime" required="required">
                  </div>
                     <div class="form-group col-md-2">
                    <label for="aridate">Arival Date</label>
                    <input type="date" class="form-control" id="aridate" name="aridate" required="required">
                  </div>
                    
                     <div class="form-group col-md-2">
                    <label for="aritime">Arrival Time</label>
                    <input type="time" class="form-control" id="aritime" name="aritime"   required="">
                  </div>
                     <div class="form-group col-md-2">
                    <label for="cost">Per Person Cost</label>
                    <input type="text" class="form-control" id="cost" name="cost" required >
                  </div>
                    <input value="A" hidden="" name="dep" id="dep">
                    <input value="B" hidden="" name="ari" id="ari">
                </div>
               
                <button type="submit" class="btn btn-primary">Make a flight</button>
             </form>
           </div>

           
           <div class=" formcon1 container w-75" >
               <h1 id="topic">Flight shedule B to A </h1>
               <form action="createflight" method="get">
               
                <div class="form-row">
                  <div class="form-group col-md-2">
                    <label for="flightid">Flight No </label>
                    <input type="text" class="form-control" id="flightid" name="flightid" required="fill this" >
                    
                  </div>
                  <div class="form-group col-md-2">
                    <label for="depdate">Depater Date</label>
                    <input type="date" class="form-control" id="depdate" name="depdate" required="requird">
                  </div>
                  <div class="form-group col-md-2">
                    <label for="deptime">Depater Time</label>
                    <input type="time" class="form-control" id="deptime" name="deptime" required="required" value="12:33">
                  </div>
                     <div class="form-group col-md-2">
                    <label for="aridate">Arival Date</label>
                    <input type="date" class="form-control" id="aridate" name="aridate" required="required">
                  </div>
                    
                     <div class="form-group col-md-2">
                    <label for="aritime">Arrival Time</label>
                    <input type="time" class="form-control" id="aritime" name="aritime"   required="">
                  </div>
                     <div class="form-group col-md-2">
                    <label for="cost">Per Person Cost</label>
                    <input type="text" class="form-control" id="cost" name="cost" required >
                  </div>
                    <input value="B" hidden="" name="dep" id="dep">
                    <input value="A" hidden="" name="ari" id="ari">
                </div>
               
                <button type="submit" class="btn btn-primary">Make a flight</button>
             </form>
               </div>
           
           
           
           
           <div  class="con2 container w-75">
               <table class="table">
                    <thead class="thead-dark">
                      <tr>
                       
                          <th scope="col">Flight no</th>
                        <th scope="col">Dep date</th>
                        <th scope="col">Arr date</th>
                         <th scope="col">Dep time </th>
                          <th scope="col">Arr time</th>
                          <th scope="col">Dep port</th>
                          <th scope="col">Arr port</th>
                          <th scope="col">cost</th>
                          
                      </tr>
                    </thead>
                    <tbody
                      <c:forEach var="b" items="${shedule}">
                      <tr>
                        
                        <td> <c:out value="${b.flightNo}"></c:out></td>
                       <td> <c:out value="${b.depdate}"></c:out></td>
                       <td> <c:out value="${b.aridate}"></c:out></td>
                       <td> <c:out value="${b.deptime}"></c:out></td>
                       <td> <c:out value="${b.aritime}"></c:out></td>
                       <td> <c:out value="${b.depairport}"></c:out></td>
                       <td> <c:out value="${b.ariairport}"></c:out></td>
                       <td> <c:out value="${b.cost}"></c:out></td>
                       <td> <a href="editflight?flightstatus=1&dbid=<c:out value="${b.dbno}"></c:out>">update</a> </td>
                       <td> <a  href="editflight?flightstatus=2&dbid=<c:out value="${b.dbno}"></c:out>">delete</a> </td>

                      </tr>
                      </c:forEach>
                    </tbody>
                  </table>
                  </div>
       </div> 
    </body>
</html>
