<%-- 
    Document   : login
    Created on : Jun 20, 2020, 6:13:33 PM
    Author     : supun chandimal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
              integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="assets/login.css">
        <title>login</title>
    </head>
    <body>
        <h1 id="login_header">Login</h1>
        <div class="con_1 container w-25 p-3" styles="     ">
            <form  action="logincontroller" method="post">
               <div class="form-group">
                 <label for="email">Email address</label>
                 <input type="email" class="form-control" id="email"  name="email" aria-describedby="emailHelp">
                 <small id="emailHelp" class="form-text text-muted"></small>
               </div>
               <div class="form-group">
                 <label for="password">Password</label>
                 <input type="password" class="form-control" id="password" name="password">
               </div>
               <div class="form-group form-check">
                 <input type="checkbox" class="form-check-input" id="exampleCheck1">
                 <label class="form-check-label" for="exampleCheck1">Check me out</label>
               </div>
               <button type="submit" class="btn btn-primary">Submit</button>
            </form> 
        </div>
    </body>
</html>
