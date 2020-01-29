package hw13.carpark;

public class TrucksCar extends CarPark {
    String typeTrucksCar;
    int carrying;

    public TrucksCar(String mark, String model, int yearRelease, Double price, String registrationNumber,
                     double сonsumptionFuel, double speed, String typeTrucksCar, int carrying) {
        super(mark, model, yearRelease, price, registrationNumber, сonsumptionFuel, speed);
        this.typeTrucksCar = typeTrucksCar;
        this.carrying = carrying;
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
                ", typeTrucksCar='" + typeTrucksCar + '\'' +
                ", carrying=" + carrying +
                '}';
    }
}

