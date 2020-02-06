package hw15.taksopark;

import hw15.taksopark.Car;

public class TrucksCar extends Car {
    String typeTrucksCar;
    int carrying;

    public TrucksCar(String mark, String model, int yearRelease, Double price, String registrationNumber,
                     int сonsumptionFuel, double speed, String typeTrucksCar, int carrying) {
        super(mark, model, yearRelease, price, registrationNumber, сonsumptionFuel, speed);
        this.typeTrucksCar = typeTrucksCar;
        this.carrying = carrying;
    }

    public String getTypeTrucksCar() {
        return typeTrucksCar;
    }

    public void setTypeTrucksCar(String typeTrucksCar) {
        this.typeTrucksCar = typeTrucksCar;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "TrucksCar{" +
                "typeTrucksCar='" + typeTrucksCar + '\'' +
                ", carrying=" + carrying +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", сonsumptionFuel=" + сonsumptionFuel +
                ", speed=" + speed +
                '}';
    }
}
