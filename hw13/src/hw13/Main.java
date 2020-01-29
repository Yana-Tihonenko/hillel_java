package hw13;

import hw13.carpark.*;
import hw13.servicecarpark.*;

import java.util.ArrayList;
import java.util.Comparator;


public class Main {

    public static void main(String[] args) {
        ArrayList<CarPark> carParks = new ArrayList<CarPark>();
        carParks.add(new PassengerCar("Mazda", "RX", 2015, 27000.00, "AX4512", 10, 200, "B", 3));
        carParks.add(new PassengerCar("BMW", "45", 2019, 30000.00, "CC4024", 12, 220, "C", 3));
        carParks.add(new PassengerCar("Opel", "CC", 2018, 23000.00, "VOVA", 9.3, 210, "A", 3));
        carParks.add(new PassengerCar("Volvo", "RX", 2018, 27000.00, "AX0511", 5, 240, "A", 3));
        carParks.add(new PassengerCar("Honda", "RX", 2019, 34000.00, "AX2345", 11.5, 180, "C", 4));
        carParks.add(new TrucksCar("TruckVolva", "4555", 2019, 20000.00, "AX2005", 14.7, 130, "tipper", 15));
        carParks.add(new TrucksCar("DAF", "4555", 2013, 19000.00, "AX1205", 15.7, 100, "tipper", 20));
        carParks.add(new TrucksCar("GAZEL", "asas", 2016, 10000.00, "AX1205", 15.7, 100, "tipper", 1));


        carParks.sort(new Comparator<CarPark>() {
            @Override
            public int compare(CarPark o1, CarPark o2) {
                if (o1.getСonsumptionFuel() < o2.getСonsumptionFuel()) return -1;
                else if (o1.getСonsumptionFuel() == o2.getСonsumptionFuel()) return 0;
                else return 1;

            }
        });
        carParks.sort((CarPark o1, CarPark o2) -> {
            if (o1.getСonsumptionFuel() < o2.getСonsumptionFuel()) return -1;
            else if (o1.getСonsumptionFuel() == o2.getСonsumptionFuel()) return 0;
            else return 1;
        });

        carParks.sort(ComparatObject::comparatorToСonsumptionFuel);

        carParks.forEach(x -> System.out.println(x.toString()));

    }
}

