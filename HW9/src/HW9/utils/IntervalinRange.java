package HW9.utils;

import static java.lang.Math.*;

public class IntervalinRange {

    public static int calculateIntervalinRange(double min, double max, int countStream) {
        double lenghtInterval = 0;
        return (int) (lenghtInterval = ceil ((max - min) / countStream));
    }
}
