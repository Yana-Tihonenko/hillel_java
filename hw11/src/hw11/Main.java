package hw11;

import hw11.filework.*;
import hw11.generatecar.GеnеraеteCar;
import hw11.servicetaksopark.SortByсonsumptionFuel;
import hw11.taksopark.*;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        String pathread = "d:\\temp\\car.txt";
        String pathwrite = "d:\\temp\\carresult.txt";
        Car[] carParks = GеnеraеteCar.gеnеraеteCar(ReadFile.readFile(pathread));
        SortByсonsumptionFuel.sortByсonsumptionFuel(carParks);
        WriteFile.writeFile(carParks, pathwrite);


    }
}
