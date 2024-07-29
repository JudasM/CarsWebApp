<%-- 
    Document   : edit_car_outcome
    Created on : 01 May 2024, 10:04:43 AM
    Author     : Judas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entites.CarImage"%>
<%@page import="java.util.Base64"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Car Outcome Page</title>
    </head>
    <body>
        <h1>Edit Outcome Page</h1>
        
        <%
            String brand = (String)request.getAttribute("brand");
            Long regNum = (Long)request.getAttribute("regnum");
        //    List<CarImage> images = new ArrayList<>();
            
           
              
        %>
        
        <table>
            <tbody>
                <tr>
                    <td>Registration Number</td>
                    <td> <%=regNum%> </td>
                </tr>
                <tr>
                    <td>Brand</td>
                    <td> <%=brand%> </td>
                </tr>
            </tbody>
        </table>
   Click <a href="index.html">Home</a> or <a href="menu.jsp">Menu</a>
            
        
    </body>
</html>
