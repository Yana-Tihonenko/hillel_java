package hw13.carpark;

public class PassengerCar extends CarPark {
    String typeClass;
    int countPassenger;

    public PassengerCar(String mark, String model, int yearRelease, Double price, String registrationNumber,
                        double сonsumptionFuel, double speed, String typeClass, int countPassenger) {
        super(mark, model, yearRelease, price, registrationNumber, сonsumptionFuel, speed);
        this.typeClass = typeClass;
        this.countPassenger = countPassenger;
    }

    @Override
    public String toString() {
        return "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", сonsumptionFuel=" + сonsumptionFuel +
                ", speed=" + speed +
                ", typeClass='" + typeClass + '\'' +
                ", countPassenger=" + countPassenger +
                '}';
    }
}
