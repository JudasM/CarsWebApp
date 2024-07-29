/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
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
public class AddCarServlet extends HttpServlet {

    @EJB
    CarFacadeLocal cfl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String registration = request.getParameter("regNo");
        String type = request.getParameter("type");
        
        Part imagePart = request.getPart("pic1");
        Part imagePart2 = request.getPart("pic2");
        
        
        Car car = createCar(registration,type,imagePart,imagePart2);
        cfl.create(car);
        
        RequestDispatcher rd = request.getRequestDispatcher("add_car_outcome.jsp");
        rd.forward(request, response);
        
        
        
            
    }

    private Car createCar(String registration, String type, Part imagePart, Part imagePart2) throws IOException {
        Car car = new Car();
        List<CarImage> cars = new ArrayList<>();
        CarImage car1 = new CarImage();
        CarImage car2 = new CarImage();
        
        byte[] c1 = readImageData(imagePart);
        byte[] c2 = readImageData(imagePart2);
        
        car1.setImage_source(c1);
        car2.setImage_source(c2);
        cars.add(car1);
        cars.add(car2);
        
        car.setRegNum(registration);
        car.setType(type);
        car.setImages(cars);
        
        return car;
        
    }

    private byte[] readImageData(Part e) throws IOException {
    
        InputStream inputStream = e.getInputStream();
        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        return buffer;
    
    } 
}
