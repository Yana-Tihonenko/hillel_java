package HW9.utils;

public class SimpleNumber {

    public static boolean findSimpleNumber(int number) {
        int count = 0;
        for (int i = number; i > 1; i--) {
            if ((number % i == 0) && (number != 1)) {
                count = count + 1;
            }
        }
        if (count <= 1) {
            return true;
        }
        return false;
    }
}
