

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
             <a href="#">Shedule</a>

       </div>

       <!-- Page content -->
       <div class="main">
           <div class=" formcon1 container w-75" >
               <form action="editaircrafts?state=2" method="get">
               
                <div class="form-row">
                  <div class="form-group col-md-4">
                    <label for="registrationid">Reg no</label>
                    <input type="text" class="form-control" id="registrationid" name="registrationid" required="required" value="<c:out value="${aircraft.registrationid}"></c:out>" readonly="readonly" >
                    
                  </div>
                  <div class="form-group col-md-4">
                    <label for="name">Name</label>
                    <input type="text" class="form-control" id="name" name="name" required="requird" value="<c:out value="${aircraft.name}"></c:out>" >
                  </div>
                  <div class="form-group col-md-4">
                    <label for="seats">Seats</label>
                    <input type="text" class="form-control" id="seats" name="seats" required="required" value="<c:out value="${aircraft.seats}"></c:out>">
                  </div>
                </div>
                  <input hidden="" value="2" name="state">
                   <input hidden="" value="<c:out value="${aircraft.aircraftid}"></c:out>" name="id">

                <button type="submit" class="btn btn-primary">update</button>
             </form>
               </div>
        
       </div> 
    </body>
</html>
