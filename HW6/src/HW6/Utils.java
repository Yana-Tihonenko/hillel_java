package HW6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utils {
    public static Triangle[] arrayResize(Triangle[] triangleresize) {
        int i = 0;
        Triangle[] temp = new Triangle[triangleresize.length + 1];
        for (Triangle arrayResizetemp : triangleresize) {
            temp[i] = arrayResizetemp;
            i++;
        }
        return temp;
    }

    public static double rounddouble(double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
