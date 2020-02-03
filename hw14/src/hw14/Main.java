package hw14;

import hw14.task1.filework.ReadFile;
import hw14.task1.filework.WriteFile;
import hw14.task1.generatecar.GеnеraеteCar;
import hw14.task1.taksopark.Car;
import hw14.task2.MyLinkedList;

import java.io.IOException;
import java.util.*;

import static hw14.task3.CountWordFromText.countWordFromText;

public class Main {

    public static void main(String[] args) {
        // task1
        String pathread = "d:\\temp\\car.txt";
        String pathwrite = "d:\\temp\\carresult.txt";
        try {
            List<Car> carParks = GеnеraеteCar.gеnеraеteCar(ReadFile.readFile(pathread));
            Collections.sort(carParks, new Comparator<Car>() {
                @Override
                public int compare(Car o1, Car o2) {
                    if (o1.getСonsumptionFuel() < o2.getСonsumptionFuel()) return -1;
                    else if (o1.getСonsumptionFuel() == o2.getСonsumptionFuel()) return 0;
                    else return 1;
                }
            });
            WriteFile.writeFile(carParks, pathwrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //task2
        MyLinkedList<String> list = new MyLinkedList();
        String str1 = "first element";
        String str2 = "next element";
        String str3 = "add to index element";
        list.addFirst(str1);
        list.addFirst(str2);
        list.addFirst(str3);
        for (String v : list) {
            System.out.println(v);
        }


        // task3
        String str = "The next day, business began to pick up. Not dramatically, but bit by bit.\n" +
                "A sack of potatoes here…";
        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        myHashMap = countWordFromText(str);
        for (Map.Entry<String, Integer> entry : myHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());


    }
}


