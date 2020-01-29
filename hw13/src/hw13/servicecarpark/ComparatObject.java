package hw13.servicecarpark;

import hw13.carpark.*;

import java.util.Comparator;

interface Comparat {
    int comparat(Object o1, Object o2);
}

public class ComparatObject  {
    public static int comparatorToСonsumptionFuel(CarPark o1, CarPark o2) {
        if (o1.getСonsumptionFuel() < o2.getСonsumptionFuel()) return -1;
        else if (o1.getСonsumptionFuel() == o2.getСonsumptionFuel()) return 0;
        else return 1;
    }
}

