<%-- 
    Document   : index.jsp
    Created on : Sep 18, 2017, 1:28:17 PM
    Author     : 740991
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logged In</title>
    </head>
    <body>
        <h1>Main page</h1>
        <p>Hello ${username} <a href="login?loggedOut=Logged out">Logout</a></p>
        
    </body>
</html>
