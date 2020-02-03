package hw14.task1.generatecar;


import hw14.task1.taksopark.Car;
import hw14.task1.taksopark.PassengerCar;
import hw14.task1.taksopark.TrucksCar;

import java.util.ArrayList;

public class GеnеraеteCar {
    public static ArrayList<Car> gеnеraеteCar(String str) {
        ArrayList<Car> car = new ArrayList<Car>();
        String[] cars = str.split(";\r\n");
        for (int i = 0; i < cars.length; i++) {
            String[] elementcars = cars[i].split(",");
            if (elementcars[0].equals("PassengerCar")) {
                PassengerCar passengerCar = new PassengerCar();
                passengerCar.setMark(elementcars[1]);
                passengerCar.setModel(elementcars[2]);
                passengerCar.setYearRelease(Integer.parseInt(elementcars[3]));
                passengerCar.setPrice(Double.parseDouble(elementcars[4]));
                passengerCar.setRegistrationNumber(elementcars[5]);
                passengerCar.setСonsumptionFuel(Double.parseDouble(elementcars[6]));
                passengerCar.setSpeed(Double.parseDouble(elementcars[7]));
                passengerCar.setTypeClass(elementcars[8]);
                passengerCar.setCountPassenger(Integer.parseInt(elementcars[9]));
                car.add(passengerCar);
            } else {
                if (elementcars[0].equals("TrucksCar")) {
                    TrucksCar trucksCar = new TrucksCar();
                    trucksCar.setMark(elementcars[1]);
                    trucksCar.setModel(elementcars[2]);
                    trucksCar.setYearRelease(Integer.parseInt(elementcars[3]));
                    trucksCar.setPrice(Double.parseDouble(elementcars[4]));
                    trucksCar.setRegistrationNumber(elementcars[5]);
                    trucksCar.setСonsumptionFuel(Double.parseDouble(elementcars[6]));
                    trucksCar.setSpeed(Double.parseDouble(elementcars[7]));
                    trucksCar.setTypeTrucksCar(elementcars[8]);
                    trucksCar.setCarrying(Integer.parseInt(elementcars[9]));
                    car.add(trucksCar);
                }
            }
        }
        return car;

    }
}