package hw11.servicetaksopark;
import hw11.taksopark.*;

public class SortByсonsumptionFuel {
    public static void sortByсonsumptionFuel(Car[] cars) {
        boolean isSorted = false;
        Car temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < cars.length - 1; i++) {
                if (cars[i].сonsumptionFuel > cars[i + 1].сonsumptionFuel) {
                    isSorted = false;

                    temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                }
            }
        }
    }
}
