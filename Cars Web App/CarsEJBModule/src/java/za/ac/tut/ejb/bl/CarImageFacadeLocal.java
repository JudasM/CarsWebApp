/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entites.CarImage;

/**
 *
 * @author Judas
 */
@Local
public interface CarImageFacadeLocal {

    void create(CarImage carImage);

    void edit(CarImage carImage);

    void remove(CarImage carImage);

    CarImage find(Object id);

    List<CarImage> findAll();

    List<CarImage> findRange(int[] range);

    int count();
    
}
