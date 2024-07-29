<%-- 
    Document   : car_outcome
    Created on : 01 May 2024, 11:28:46 AM
    Author     : Judas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Car Edit Outcome Page</title>
    </head>
    <body>
        <h1>Car Edit Outcome Page</h1>
        
        <%
            Long id = (Long)request.getAttribute("regnum");
            String brand = (String)request.getAttribute("brand");
        %>
        
      
        ID <%=id%> Updated <br>
        Brand <%=brand%> Changed 
        
        
           Click <a href="index.html">Home</a> or <a href="menu.jsp">Menu</a
    </body>
</html>
