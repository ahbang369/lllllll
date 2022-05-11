<%-- 
    Document   : login
    Created on : Mar 18, 2022, 8:02:34 PM
    Author     : 84348
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="MainController">
            User ID<input type="text" name="userID" required=""></br>
            Password<input type="password" name="password" required=""></br>
            <input type="submit" name="action" value="Login">
        </form>
        
        <%
            String error = (String)request.getAttribute("ERROR");
            if(error == null){
                error="";
            }
        %>
        <%= error %>
    </body>
</html>
