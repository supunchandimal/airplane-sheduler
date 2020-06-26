

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
               <form action="aircraftregistration" method="get">
               
                <div class="form-row">
                  <div class="form-group col-md-4">
                    <label for="registrationid">Reg no</label>
                    <input type="text" class="form-control" id="registrationid" name="registrationid" required="required" >
                    
                  </div>
                  <div class="form-group col-md-4">
                    <label for="name">Name</label>
                    <input type="text" class="form-control" id="name" name="name" required="requird">
                  </div>
                  <div class="form-group col-md-4">
                    <label for="seats">Seats</label>
                    <input type="text" class="form-control" id="seats" name="seats" required="required">
                  </div>
                </div>
               
                <button type="submit" class="btn btn-primary">Register Aircraft</button>
             </form>
               </div>
            
           <div  class="con2 container w-75">
               <table class="table">
                    <thead class="thead-dark">
                      <tr>
                       
                        <th scope="col">regsitration no</th>
                        <th scope="col">name</th>
                        <th scope="col">Seats</th>
                         <th scope="col">Edit</th>
                          <th scope="col">Delete</th>
                      </tr>
                    </thead>
                    <tbody
                      <c:forEach var="b" items="${aicrafts}">
                      <tr>
                        
                        <td> <c:out value="${b.registrationid}"></c:out></td>
                       <td> <c:out value="${b.name}"></c:out></td>
                       <td> <c:out value="${b.seats}"></c:out></td>
                       <td>    <a href="editaircrafts?id=<c:out value="${b.aircraftid}"></c:out>&state=1">edit</a> </td>
                       <td>    <a href="editaircrafts?id=<c:out value="${b.aircraftid}"></c:out>&state=3">delete</a> </td>

                      </tr>
                      </c:forEach>
                    </tbody>
                  </table>
                  </div>
       </div> 
    </body>
</html>
