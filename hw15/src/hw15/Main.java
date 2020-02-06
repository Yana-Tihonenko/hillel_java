package hw15;

import hw15.servicetaksopark.TaxiPark;
import hw15.taksopark.Car;
import hw15.taksopark.PassengerCar;
import hw15.taksopark.TrucksCar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Car> carParks = new ArrayList<Car>();
        carParks.add(new PassengerCar("Mazda", "RX", 2015, 27000.00, "AX4512", 10, 200, "B", 3));
        carParks.add(new PassengerCar("BMW", "45", 2019, 30000.00, "CC4024", 12, 220, "C", 3));
        carParks.add(new PassengerCar("Opel", "CC", 2018, 23000.00, "VOVA", 9, 210, "A", 3));
        carParks.add(new PassengerCar("Volvo", "RX", 2018, 27000.00, "AX0511", 5, 240, "A", 3));
        carParks.add(new PassengerCar("Honda", "RX", 2019, 34000.00, "AX2345", 11, 180, "C", 4));
        carParks.add(new TrucksCar("TruckVolva", "4555", 2019, 20000.00, "AX2005", 14, 130, "tipper", 15));
        carParks.add(new TrucksCar("DAF", "4555", 2013, 19000.00, "AX1205", 15, 100, "tipper", 20));
        carParks.add(new TrucksCar("GAZEL", "asas", 2016, 10000.00, "AX1205", 15, 100, "tipper", 1));
        TaxiPark taxiPark = new TaxiPark(carParks);
        double countingCost = taxiPark.countingCost();
        List<Car> filterTaxiPark = taxiPark.filterBySpeedMaxMin(210, 200);
        List<Car> sortByсonsumptionFuel=taxiPark.sortByсonsumptionFuel();

    }

}
