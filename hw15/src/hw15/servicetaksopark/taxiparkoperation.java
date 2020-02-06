package hw15.servicetaksopark;

import hw15.taksopark.Car;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface taxiparkoperation <E>{

    List <E>  sortByсonsumptionFuel ();
    List <E> filterBySpeedMaxMin( double maxSpeed, double minSpeed);
    public double countingCost();

}
