<%-- 
    Document   : get_cars
    Created on : 01 May 2024, 6:54:37 AM
    Author     : Judas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Cars Page</title>
    </head>
    <body>
        <h1>Get Car Images Page</h1>
        <p>
            Click button to get all Cars 
        </p>
        
        <form action="GetCarsServlet.do" method="GET">
            <input type="submit" value="GET CARS">
        </form>
    </body>
</html>
