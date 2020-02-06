package hw15.taksopark;

import hw15.taksopark.Car;

public class PassengerCar extends Car {
    String typeClass;
    int countPassenger;

    public PassengerCar(String mark, String model, int yearRelease, Double price, String registrationNumber,
                        int сonsumptionFuel, double speed, String typeClass, int countPassenger) {
        super(mark, model, yearRelease, price, registrationNumber, сonsumptionFuel, speed);
        this.typeClass = typeClass;
        this.countPassenger = countPassenger;
    }

    public String getTypeClass() {
        return typeClass;
    }

    public void setTypeClass(String typeClass) {
        this.typeClass = typeClass;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "countPassenger=" + countPassenger +
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
