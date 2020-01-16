package mylen;

public class Car {
    int id;
    String mark;
    String model;
    int yearRelease;
    String color;
    Double price;
    String registrationNumber;

    public Car(int id, String mark, String model, int year_release, String color, Double price, String registrationNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearRelease = yearRelease;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }


    void printCar () {
        System.out.println("id=" + this.id + "; " +
                "year_release=" + this.yearRelease + "; " +
                "price=" + this.price + "; " +
                "mark=" + this.mark + "; " +
                "color=" + this.color + "; " +
                "registration_number=" + this.registrationNumber);
    }
}
