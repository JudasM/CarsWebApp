/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.CarFacadeLocal;
import za.ac.tut.entites.Car;
import za.ac.tut.entites.CarImage;

/**
 *
 * @author Judas
 */
public class GetCarsServlet extends HttpServlet {

@EJB
CarFacadeLocal cfl;

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          List<Car> cars = cfl.findAll();
          
          request.setAttribute("cars", cars);
          RequestDispatcher rd = request.getRequestDispatcher("get_cars_outcome.jsp");
         rd.forward(request, response);
    }


}
