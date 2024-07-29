/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import za.ac.tut.ejb.bl.CarFacadeLocal;
import za.ac.tut.entites.Car;
import za.ac.tut.entites.CarImage;

/**
 *
 * @author Judas
 */
@MultipartConfig
public class EditCarServlet extends HttpServlet {

@EJB
CarFacadeLocal cfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            Long regnum = Long.parseLong(request.getParameter("regnum"));
            String brand = request.getParameter("brand");
            Part image = request.getPart("car1");
         
            Car car = editPerson(regnum,brand,image); //creating the car
            cfl.edit(car); //change car details
            
            request.setAttribute("brand", brand);
            request.setAttribute("regnum", regnum);
            RequestDispatcher rd = request.getRequestDispatcher("car_outcome.jsp");
            rd.forward(request, response);
        
    }

    private Car editPerson(Long regnum, String brand, Part image) throws IOException {
        Car c = cfl.find(regnum);
       
        List<CarImage> images = new ArrayList<>();
        CarImage car1 = new CarImage(); // instance of car image
        
        byte[] c1 = readImageData(image); //helper method to upload and edit the image in database
        
        //editing the picture in the database
        car1.setImage_source(c1);
        images.add(car1);
        c.setImages(images);
       
        //editing the type in the databse
        c.setType(brand);
         
        return c;
               
    }

    private byte[] readImageData(Part image) throws IOException {
        
        InputStream inputStream = image.getInputStream();
        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        
        return  buffer;
        
        
    }



 
}
