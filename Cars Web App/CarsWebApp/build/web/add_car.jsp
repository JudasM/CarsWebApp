<%-- 
    Document   : add_car
    Created on : 30 Apr 2024, 9:28:41 PM
    Author     : Judas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Car Page</title>
    </head>
    <body>
        <h1>Add Car Page</h1>
        
        <form action="AddCarServlet.do" method="POST" enctype="multipart/form-data">
            <table>
                <tbody>
                    <tr>
                        <td> Registration Number: </td>
                        <td> <input type="text" name="regNo"> </td>
                    </tr>
                    <tr>
                        <td> Type </td>
                        <td> <input type="text" name="type"> </td>
                    </tr>
                    <tr>
                        <td> Pic 1 </td>
                        <td> <input type="file" name="pic1" accept=".jpg, .jpeg, .png"> </td>
                    </tr>
                    <tr>
                        <td> Pic 2 </td>
                        <td> <input type="file" name="pic2" accept=".jpg, .jpeg, .png"> </td>
                    </tr>
                    
                    
                    
                    <tr>
                        <td></td>
                        <td> <input type="submit" value="ADD CAR"></td>
                    </tr>
                </tbody>
            </table>

        </form>
        
        
    </body>
</html>
