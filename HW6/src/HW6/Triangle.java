package HW6;

import static HW6.Utils.rounddouble;
import static HW6.СalculatePoint.distanceBetweenPoint;
import static java.lang.Math.sqrt;

public class Triangle {

    Point[] points;

    public Triangle(Point[] points) {
        this.points = points;
    }

    public static double countPerimeter(Triangle triangle) {
        double countPerimeter;
        countPerimeter = (distanceBetweenPoint(triangle.points[0], triangle.points[1])
                +distanceBetweenPoint(triangle.points[1], triangle.points[2])
                +distanceBetweenPoint(triangle.points[0], triangle.points[2]));

        return rounddouble(countPerimeter);

    }

    public static double countSquare(Triangle triangle) {
        double countSquare = 0;
        countSquare = sqrt(semiperimeter(triangle)
                *(semiperimeter(triangle) - distanceBetweenPoint(triangle.points[0], triangle.points[1]))
                *(semiperimeter(triangle) - distanceBetweenPoint(triangle.points[1], triangle.points[2]))
                *(semiperimeter(triangle) - distanceBetweenPoint(triangle.points[0], triangle.points[2])));

        return rounddouble(countSquare);
    }

    public static double semiperimeter(Triangle triangle) {
        double countSquare;
        countSquare = countPerimeter(triangle) / 2;
        return rounddouble(countSquare);
    }
}
