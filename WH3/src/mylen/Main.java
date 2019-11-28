package mylen;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // task 1
        int[] myArrayFindOddEvenNumber = {1, 2, 3, 4, 5, 6, 7};
        AllMethodClass.FindOddEvenNumber(myArrayFindOddEvenNumber);

        //task2
        int[] myArraysFindSimpleNumber = {5, 1, 4, 3, 9, 0, 10, 7, 11, 12};
        AllMethodClass.FindSimpleNumber(myArraysFindSimpleNumber);

        //task3
        int count = 20;
        AllMethodClass.ArrayFibonacciNumber(count);

        //task4
        int[] arrayMaxMin = {1, 0, 5, 64, 45};
        AllMethodClass.FindMaxMinNumber(arrayMaxMin);

            }
}

class AllMethodClass {

    public static void FindOddEvenNumber(int[] findOddEvenNumber) {

        String oddnumber = "This is odd number ";
        String evennumber = "This is even number ";
        for (int i = 0; i < findOddEvenNumber.length; i++) {
            if (findOddEvenNumber[i] % 2 == 0) {
                evennumber = evennumber + Integer.toString(findOddEvenNumber[i]) + " ";
            } else {
                oddnumber = oddnumber + Integer.toString(findOddEvenNumber[i]) + " ";
            }
        }
        System.out.println(oddnumber);
        System.out.println(evennumber);
    }

    public static void FindSimpleNumber(int[] findSimpleNumber) {

        String simplenumber = "This is simple number ";
        for (int i = 0; i < findSimpleNumber.length; i++) {
            if (findSimpleNumber[i] != 0) {
                int count = 0;
                for (int jj = 2; findSimpleNumber[i] - jj > 1; jj++) {
                    if (findSimpleNumber[i] % jj == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    simplenumber = simplenumber + Integer.toString(findSimpleNumber[i]) + " ";
                }
            }
        }
        System.out.println(simplenumber);
    }

    public static void ArrayFibonacciNumber(int count) {
        int[] arrayFibonacciNumber = new int[count];
        int first = 1;
        int second = 1;
        arrayFibonacciNumber[0] = first;
        arrayFibonacciNumber[1] = second;
        for (int i = 2; i < count; i++) {
            int last = first + second;
            arrayFibonacciNumber[i] = last;
            first = second;
            second = last;
        }
        System.out.println(Arrays.toString(arrayFibonacciNumber));
    }

    public static void FindMaxMinNumber(int[] findMaxMinNumber){
        int max = 0;
        int min = 0;
        for (int i = 0; i < findMaxMinNumber.length; i++) {
            if (max < findMaxMinNumber[i]) {
                max = findMaxMinNumber[i];
            }
            if (min > findMaxMinNumber[i]) {
                min = findMaxMinNumber[i];
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }

}

