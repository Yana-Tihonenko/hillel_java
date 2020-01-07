package HW9.threads;

import static HW9.generetedArrSimpleNumber.ArraySimpleNumber.generatedArraySimpleNumber;
import static HW9.utils.SimpleNumber.*;

import java.util.ArrayList;

public class MyThread implements Runnable {

    String name;
    int minrang;
    int maxrang;
    ArrayList<Integer> simpleNumberArray;
    public Thread myThread;


    public MyThread(String name, int minrang, int maxrang, ArrayList<Integer> simpleNumberArray) throws InterruptedException {
        this.name = name;
        this.minrang = minrang;
        this.maxrang = maxrang;
        this.simpleNumberArray = simpleNumberArray;
        myThread = new Thread(this);
        myThread.start();
        //System.out.println("Start " + name + " min is " + minrang + " max is  " + maxrang);
    }

    @Override
    public void run() {
        for (int i = minrang; i <= maxrang; i++) {
            if (findSimpleNumber(i) == true) {
                generatedArraySimpleNumber(simpleNumberArray, i);
                System.out.println((i));
            }
        }

    }


}
