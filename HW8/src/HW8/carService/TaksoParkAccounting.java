package HW8.carService;

import HW8.interfaces.IcarPark;
import HW8.cars.*;
import HW8.technicalService.*;

public class TaksoParkAccounting implements IcarPark {


    @Override
    public double countingCost(Car[] cars) {
        double cost = 0.0;
        for (Car counting : cars) {
            cost = cost + counting.getPrice();
        }
        return cost;
    }

    @Override
    public void sortByсonsumptionFuel(Car[] cars) {
        boolean isSorted = false;
        Car temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < cars.length - 1; i++) {
                if (cars[i].getСonsumptionFuel() > cars[i + 1].getСonsumptionFuel()) {
                    isSorted = false;

                    temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                }
            }
        }
    }

    @Override
    public Car[] filterBySpeedMaxMin(Car[] cars, double maxSpeed, double minSpeed) {
        int j = 0;
        Car[] totalArrayfilterBySpeed = new Car[0];
        for (Car arrayBySpeed : cars) {
            if (arrayBySpeed.getSpeed() >= minSpeed && arrayBySpeed.getSpeed() <= maxSpeed) {
                totalArrayfilterBySpeed = ArrayResize.arrayResize(totalArrayfilterBySpeed);
                totalArrayfilterBySpeed[j] = arrayBySpeed;
                j++;

            }
        }
        return totalArrayfilterBySpeed;
    }

}
