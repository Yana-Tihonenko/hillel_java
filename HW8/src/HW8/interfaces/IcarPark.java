package HW8.interfaces;

import HW8.cars.Car;

public interface IcarPark {

    double countingCost(Car[] cars);

    void sortByсonsumptionFuel(Car[] cars);

    Car[] filterBySpeedMaxMin(Car[] cars, double maxSpeed, double minSpeed);


}
