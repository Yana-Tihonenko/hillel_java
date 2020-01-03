package HW6;
import static HW6.Utils.rounddouble;
import static java.lang.Math.*;


public class СalculatePoint {

    public static double distanceBetweenPoint(Point point1, Point point2) {
        double distanceBetweenPoint=0;
        distanceBetweenPoint = sqrt(pow(abs(point2.getX() - point1.getX()), 2) + pow(abs(point2.getY() - point1.getY()), 2));
        return rounddouble(distanceBetweenPoint);
    }

  }
