package hw15.servicetaksopark;

import hw15.taksopark.Car;
import java.util.*;
import java.util.stream.Collectors;

public class TaxiPark implements taxiparkoperation{
    List<Car> cars;

    public TaxiPark() {
    }


    public TaxiPark(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public double countingCost() {
        double resultcountingCost = cars.stream().reduce((s1, s2) -> s1.getPrice() + s2.getPrice());


        return resultcountingCost;
    }

    @Override
    public List<Car> sortByсonsumptionFuel() {
        List<Car> sortByсonsumptionFuel = cars.stream().sorted(Comparator.comparingInt(Car::getСonsumptionFuel)).collect(Collectors.toList());
        return sortByсonsumptionFuel;
    }

    @Override
    public List<Car> filterBySpeedMaxMin(double maxSpeed, double minSpeed) {
        ArrayList<Car> listfilterBySpeedMaxMin = cars.stream().filter((a) -> a.getSpeed() <= maxSpeed && a.getSpeed() >= minSpeed)
                .collect(Collectors.toCollection(ArrayList::new));
        return listfilterBySpeedMaxMin;
    }

    @Override
    public String toString() {
        return "TaxiPark{" +
                "cars=" + cars+
                '}';
    }
}
