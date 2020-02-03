package hw14.task1.taksopark;

public class PassengerCar extends Car {
    String typeClass;
    int countPassenger;

    public PassengerCar() {

    }

    public PassengerCar(String mark, String model, int yearRelease, Double price, String registrationNumber,
                        double сonsumptionFuel, double speed, String typeClass, int countPassenger) {
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
        return mark + "," +
                model + "," +
                yearRelease + "," +
                price + "," +
                registrationNumber + "," +
                сonsumptionFuel + "," +
                speed + "," +
                typeClass + "," +
                countPassenger + ";" + "\n";
    }
}