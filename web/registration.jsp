<%-- 
    Document   : registration
    Created on : Jun 20, 2020, 6:58:13 PM
    Author     : supun chandimal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
              integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
           <link rel="stylesheet" href="assets/reg.css">
        <title>registrations</title>
    </head>
    <body>
        <h1 id="r_header">Registration</h1>
        
        <div class="con_form container w-50 p-3">
            <form action="registrationcontroller" method="post">
                <div class="form-group row">
                  <label for="name" class="col-sm-2 col-form-label">Full Name</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control" id="name" name="name" placeholder="name">
                  </div>
                 
                </div>
                <div class="form-group row">
                  <label for="email" class="col-sm-2 col-form-label">Email</label>
                  <div class="col-sm-10">
                      <input type="email" class="form-control" id="email"  name="email" placeholder="email">
                  </div>
                </div>
                <div class="form-group row">
                  <label for="password" class="col-sm-2 col-form-label">Password</label>
                  <div class="col-sm-10">
                      <input type="password" class="form-control" id="password" name="password" placeholder="Password">
                  </div>
                </div>
                <div class="form-group row">
                  <label for="phone" class="col-sm-2 col-form-label">phone</label>
                  <div class="col-sm-10">
                      <input type="number" class="form-control" id="phone" name="phone"placeholder="phone">
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-sm-10">
                    <button type="submit" class="btn btn-primary">Register</button>
                  </div>
                </div>
            </form>
        </div>
    </body>
</html>
