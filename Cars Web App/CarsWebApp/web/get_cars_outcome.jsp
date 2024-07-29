<%@page import="za.ac.tut.entites.CarImage"%>
<%@page import="java.util.Base64"%>
<%@page import="za.ac.tut.entites.Car"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Get Cars Outcome Page</title>
</head>
<body>
    <h1>Get Cars Outcome Page</h1>
    
    <%
        List<Car> cars = (List<Car>)request.getAttribute("cars");
    %>
    
    <p>Below are the cars Images retrieved from database</p>
    
    <table>
        <thead>
            <tr>
                <th>Registration Number</th>
                <th>Brand</th>
                <th>Image</th>
            </tr>
        </thead>
        <tbody>
            <%
                for(Car c : cars) {
                    String regnum = c.getRegNum();
                    String type = c.getType();
                    
                    for(CarImage image : c.getImages()) {
                        String source = "data:image/png;base64," + Base64.getEncoder().encodeToString(image.getImage_source());
            %>
            <tr>
                <td><%= regnum %></td>
                <td><%= type %></td>
                <td><img src="<%= source %>" width="270px" height="150px" alt=""></td>
            </tr>
            <%
                    }
                }
            %>
        </tbody>
    </table>

    Click <a href="index.html">Home</a> or <a href="menu.jsp">Menu</a>
</body>
</html>
