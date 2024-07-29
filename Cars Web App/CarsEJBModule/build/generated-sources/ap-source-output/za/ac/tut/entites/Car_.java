package za.ac.tut.entites;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entites.CarImage;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-05-01T15:35:23")
@StaticMetamodel(Car.class)
public class Car_ { 

    public static volatile ListAttribute<Car, CarImage> images;
    public static volatile SingularAttribute<Car, String> regNum;
    public static volatile SingularAttribute<Car, Long> id;
    public static volatile SingularAttribute<Car, String> type;

}