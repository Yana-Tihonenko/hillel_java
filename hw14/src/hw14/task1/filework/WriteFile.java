package hw14.task1.filework;

import hw14.task1.taksopark.Car;
import hw14.task1.taksopark.PassengerCar;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class WriteFile {

    public static void writeFile(List<Car> car, String path) throws IOException {
        FileOutputStream carToFile = new FileOutputStream(path);
        for (Car x : car) {
            if (x instanceof PassengerCar) {
                String writeToFile = "PassengerCar" + "," + x.toString();
                carToFile.write(writeToFile.getBytes());
            } else {
                String writeToFile = "TrucksCar" + "," + x.toString();
                carToFile.write(writeToFile.getBytes());
            }
        }
        carToFile.close();
    }
}