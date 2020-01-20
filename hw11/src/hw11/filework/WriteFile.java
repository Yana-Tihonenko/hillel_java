package hw11.filework;

import hw11.taksopark.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

    public static void writeFile(Car[] car, String path) throws IOException {
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
