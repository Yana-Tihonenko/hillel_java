package HW9;

import java.util.ArrayList;
import java.util.Scanner;

import HW9.threads.MyThread;

import static HW9.utils.IntervalinRange.calculateIntervalinRange;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        double minrange;
        ArrayList<Integer> arraySimpleNumber = new ArrayList<Integer>();
        System.out.println("Enter min number of range");
        Scanner scan = new Scanner(System.in);
        minrange = scan.nextDouble();
        System.out.println("Enter max number of range");
        double maxrange = scan.nextDouble();
        System.out.println("Enter count stream");
        int countstream = scan.nextInt();
        int countIntervalOfRange = calculateIntervalinRange(minrange, maxrange, countstream);
        System.out.println(countIntervalOfRange);
        int calculatemin = (int) minrange;
        int calculatemax = (int) minrange + countIntervalOfRange - 1;
        MyThread[] arrayThreads = new MyThread[countstream];
        for (int i = 0; i < countstream; i++) {
            arrayThreads[i] = new MyThread("Thread" + i, calculatemin, calculatemax, arraySimpleNumber);
            calculatemin = calculatemax + 1;
            if (calculatemin + countIntervalOfRange - 1 > maxrange)
                calculatemax = (int) maxrange;
            else calculatemax = calculatemin + countIntervalOfRange - 1;
        }

        for (MyThread threads : arrayThreads) {
            try {
                threads.myThread.join();
            } catch (InterruptedException e) {
            }
        }


        //System.out.println((arraySimpleNumber));

    }


}