package HW8;

import HW8.carService.TaksoParkAccounting;
import HW8.cars.*;
import HW8.technicalService.*;


public class Main {

    public static void main(String[] args) {
        TaksoParkAccounting taksoParkAccounting = new TaksoParkAccounting();
        Car[] carParks = new Car[8];
        carParks[0] = new PassengerCar("Mazda", "RX", 2015, 27000.00, "AX4512", 10, 200, "B", 3);
        carParks[1] = new PassengerCar("BMW", "45", 2019, 30000.00, "CC4024", 12, 220, "C", 3);
        carParks[2] = new PassengerCar("Opel", "CC", 2018, 23000.00, "VOVA", 9.3, 210, "A", 3);
        carParks[3] = new PassengerCar("Volvo", "RX", 2018, 27000.00, "AX0511", 5, 240, "A", 3);
        carParks[4] = new PassengerCar("Honda", "RX", 2019, 34000.00, "AX2345", 11.5, 180, "C", 4);
        carParks[5] = new TrucksCar("TruckVolva", "4555", 2019, 20000.00, "AX2005", 14.7, 130, "tipper", 15);
        carParks[6] = new TrucksCar("DAF", "4555", 2013, 19000.00, "AX1205", 15.7, 100, "tipper", 20);
        carParks[7] = new TrucksCar("GAZEL", "asas", 2016, 10000.00, "AX1205", 15.7, 100, "tipper", 1);

        System.out.println("CarPark cost " + taksoParkAccounting.countingCost(carParks) + " usd");

        System.out.println("sortByсonsumptionFuel");
        taksoParkAccounting.sortByсonsumptionFuel(carParks);
        for (Car printcar : carParks) {
            System.out.println(printcar.toString());
        }

        System.out.println("filterBySpeedMaxMin");
        Car[] filterBySpeedMaxMin = taksoParkAccounting.filterBySpeedMaxMin(carParks, 150.00, 100.00);
        for (Car printcar : filterBySpeedMaxMin) {
            System.out.println(printcar.toString());
        }
    }
}
