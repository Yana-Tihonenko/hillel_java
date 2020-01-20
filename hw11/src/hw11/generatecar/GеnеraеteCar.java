package hw11.generatecar;

import hw11.servicearray.ArrayResize;
import hw11.taksopark.Car;
import hw11.taksopark.PassengerCar;
import hw11.taksopark.TrucksCar;

public class GеnеraеteCar {
    public static Car[] gеnеraеteCar(String str) {
        Car[] car = new Car[0];
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
                car = ArrayResize.arrayResize(car);
                car[i] = passengerCar;
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
                    car = ArrayResize.arrayResize(car);
                    car[i] = trucksCar;
                }
            }
        }
        return car;

    }
}
