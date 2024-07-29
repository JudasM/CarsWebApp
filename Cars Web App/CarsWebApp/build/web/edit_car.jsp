<%-- 
    Document   : edit_car
    Created on : 01 May 2024, 9:32:03 AM
    Author     : Judas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Car Page</title>
    </head>
    <body>
        <h1>Edit Car Page</h1>
        <p>
            Enter details of car to edit
        </p> 
            
        <form action="EditCarServlet.do" method="POST" enctype="multipart/form-data">
            <table>
                <tbody>
                    <tr>
                        <td>Id: </td>
                        <td> <input type="text" name="regnum"> </td>
                    </tr>
                    <tr>
                        <td>Brand</td>
                        <td> <input type="text" name="brand"> </td>
                    </tr>
                    <tr>
                        <td> Car Image </td>
                        <td> <input type="file" name="car1" accept=".jpeg,.png,.jpg"></td>
                    </tr>
                    <tr>
                        <td>   </td>
                        <td>  <input type="submit" value="Edit Car"> </td>
                    </tr>
                </tbody>
            </table>

            
        </form>
        
        
    </body>
</html>
