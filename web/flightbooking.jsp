

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
           
             <a href="loadflight">Booking </a>
             

       </div>

       <!-- Page content -->
       <div class="main">
           <div  class="con2 container w-75">
               <c:out value="${bookingmsg}">${bookingmsg}</c:out>

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
                           <th scope="col">available seats</th>
                          
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
                       <td> <c:out value="${b.availableseats}"></c:out></td>
                       <td> <button> <a href="bookingflight?dbid=<c:out value="${b.dbno}"></c:out>&availabelseats=<c:out value="${b.availableseats}"></c:out>">book</a></button> </td>
                      

                      </tr>
                      </c:forEach>
                    </tbody>
                  </table>
                  </div>
       </div> 
    </body>
</html>
