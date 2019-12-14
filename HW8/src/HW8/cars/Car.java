package HW8.cars;

import HW8.interfaces.Icar;
import HW8.carService.*;

public class Car implements Icar {
    String mark;
    String model;
    int yearRelease;
    Double price;
    String registrationNumber;
    double сonsumptionFuel;
    double speed;

    public Car(String mark, String model, int yearRelease, Double price, String registrationNumber,
               double сonsumptionFuel, double speed) {
        this.mark = mark;
        this.model = model;
        this.yearRelease = yearRelease;
        this.price = price;
        this.registrationNumber = registrationNumber;
        this.сonsumptionFuel = сonsumptionFuel;
        this.speed = speed;

    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getСonsumptionFuel() {
        return сonsumptionFuel;
    }

    public void setСonsumptionFuel(double сonsumptionFuel) {
        this.сonsumptionFuel = сonsumptionFuel;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

}
