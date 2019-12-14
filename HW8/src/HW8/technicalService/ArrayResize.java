package HW8.technicalService;

import HW8.cars.Car;


public class ArrayResize {
    public static Car[] arrayResize(Car[] carParksresize) {
        int i = 0;
        Car[] temp = new Car[carParksresize.length + 1];
        for (Car arrayResizetemp : carParksresize) {
            temp[i] = arrayResizetemp;
            i++;
        }
        return temp;
    }
}
