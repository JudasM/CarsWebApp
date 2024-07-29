/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entites.Car;

/**
 *
 * @author Judas
 */
@Local
public interface CarFacadeLocal {

    void create(Car car);

    void edit(Car car);

    void remove(Car car);

    Car find(Object id);

    List<Car> findAll();

    List<Car> findRange(int[] range);

    int count();
    
}
