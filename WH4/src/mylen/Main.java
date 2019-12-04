package mylen;

public class Main {

    public static void main(String[] args) {
        // task1
        System.out.println("Task 1");
        int[] firstArray = {1, 4, 3, 4, 5};
        int[] secondArray = {2, -3, 4, 5, 6};
        String subset = "";
        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if (secondArray[i] == firstArray[j] && i < firstArray.length) {
                    subset = subset + secondArray[i];
                    break;
                }
            }

        }
        System.out.println("subset is " + subset);


        // task2
        System.out.println("Task 2");
        int[] arrayMaxMinLength = {133,5222, 35420, 2254, 1111, 3333, 15000};
        int maxcount = 1;
        int mincount = 1;
        int minNumber = arrayMaxMinLength[0];
        int maxNumber = 0;
        for (int i = 0; i < arrayMaxMinLength.length; i++) {
            int search = arrayMaxMinLength[i];
            int count = 1;
            while (search / 10 > 0) {
                count += 1;
                search = search / 10;
            }
            if (maxcount <= count && maxNumber < arrayMaxMinLength[i]) {
                maxcount = count;
                maxNumber = arrayMaxMinLength[i];
            }
            if (minNumber >= arrayMaxMinLength[i] && maxcount >= count) {
                mincount = count;
                minNumber = arrayMaxMinLength[i];
            }
        }

        System.out.println("Max number=" + maxNumber + ";" + " Length=" + maxcount);
        System.out.println("Min number=" + minNumber + ";" + " Length=" + mincount);

        // task 3
        System.out.println("Task 3");
        int[] arrayVariousNumber = {1, 11, 1231, 223, 12, 15424, 36, 2542};
        for (int i = 0; i < arrayVariousNumber.length; i++) {
            int[] arraySearchVariousNumber = new int[10];
            int search = arrayVariousNumber[i];
            boolean printis = true;
            while (!(search == 0)) {
                int f = search % 10;
                search = search / 10;
                if (arraySearchVariousNumber[f] == 0) {
                    arraySearchVariousNumber[f] = 1;
                } else {
                    printis = false;
                    break;
                }
            }

            if (printis == true) {
                System.out.println(arrayVariousNumber[i]);
            }

        }
        // task 4
        System.out.println("Task 4");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5};
        int k = 0;
        int n;
        if (Math.sqrt(array.length) % 1 == 0) {
            n = (int) Math.sqrt(array.length);
        } else
            n = 1 + (int) Math.sqrt(array.length);
        int[][] printArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (k <= array.length - 1) {
                    printArray[i][j] = array[k];
                    System.out.print(printArray[i][j] + " ");
                    k++;
                } else
                    break;
            }
            if (k == array.length) {
                break;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sort reverse order");

        for (int i = printArray.length - 1; i >= 0; i--) {
            for (int j = printArray.length - 1; j >= 0; j--) {
                System.out.print(printArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
