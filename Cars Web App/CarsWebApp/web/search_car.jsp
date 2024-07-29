<%-- 
    Document   : search_car
    Created on : 01 May 2024, 9:36:27 AM
    Author     : Judas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Car Page</title>
    </head>
    <body>
        <h1>Search Car Page</h1>
        <form action="SearchCarServlet.do" method="POST">
            <table>

                <tbody>
                    <tr>
                        <td>ID </td>
                        <td> <input type="text" name="id"> </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td> <input type="submit" value="SEARCH"> </td>
                    </tr>
                </tbody>
            </table>

            
        </form>
        
    </body>
</html>
