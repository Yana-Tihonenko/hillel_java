package mylen;

public class Car {
 int id;
 String mark;
 String model;
 int year_release;
 String color;
 Double price;
 String registration_number;

    public Car(int id, String mark, String model, int year_release, String color, Double price, String registration_number) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year_release = year_release;
        this.color = color;
        this.price = price;
        this.registration_number = registration_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYear_release() {
        return year_release;
    }

    public void setYear_release(int year_release) {
        this.year_release = year_release;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }
}
