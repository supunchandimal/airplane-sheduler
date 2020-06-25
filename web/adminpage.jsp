<%-- 
    Document   : adminpage
    Created on : Jun 20, 2020, 7:36:37 PM
    Author     : supun chandimal
--%>

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
             <a href="#">Air crafts</a>
             <a href="#">Shedule</a>
>
       </div>

       <!-- Page content -->
       <div class="main">
           <div class=" formcon1 container w-75" >
               <form action="aircraftregistration" method="get">
               
                <div class="form-row">
                  <div class="form-group col-md-4">
                    <label for="registrationid">Reg no</label>
                    <input type="text" class="form-control" id="registrationid" name="registrationid">
                    
                  </div>
                  <div class="form-group col-md-4">
                    <label for="name">Name</label>
                    <input type="text" class="form-control" id="name" name="name">
                  </div>
                  <div class="form-group col-md-4">
                    <label for="seats">Seats</label>
                    <input type="text" class="form-control" id="seats" name="seats">
                  </div>
                </div>
               
                <button type="submit" class="btn btn-primary">Register Aircraft</button>
             </form>
               </div>
           </div> 
    </body>
</html>
