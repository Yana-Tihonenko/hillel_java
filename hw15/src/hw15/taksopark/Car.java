package hw15.taksopark;

public class Car {
    String mark;
    String model;
    int yearRelease;
    Double price;
    String registrationNumber;
    int сonsumptionFuel;
    double speed;

    public Car(String mark, String model, int yearRelease, Double price, String registrationNumber, int сonsumptionFuel, double speed) {
        this.mark = mark;
        this.model = model;
        this.yearRelease = yearRelease;
        this.price = price;
        this.registrationNumber = registrationNumber;
        this.сonsumptionFuel = сonsumptionFuel;
        this.speed = speed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getСonsumptionFuel() {
        return сonsumptionFuel;
    }

    public void setСonsumptionFuel(int сonsumptionFuel) {
        this.сonsumptionFuel = сonsumptionFuel;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", сonsumptionFuel=" + сonsumptionFuel +
                ", speed=" + speed +
                '}';
    }
}
