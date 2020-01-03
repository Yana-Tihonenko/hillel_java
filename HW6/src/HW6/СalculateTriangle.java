package HW6;

import static HW6.Triangle.*;
import static HW6.СalculatePoint.distanceBetweenPoint;
import static HW6.Utils.*;
import static java.lang.Math.*;


public class СalculateTriangle {


    public static double calculateMaxPerimeter(Triangle[] triangles) {
        double max = countPerimeter(triangles[0]);
        for (int i = 0; i < triangles.length - 1; i++) {
            double next = countPerimeter(triangles[i + 1]);
            if (max < next) {
                max = next;
            }
        }
        return max;
    }

    public static double calculateMinPerimeter(Triangle[] triangles) {
        double min = countPerimeter(triangles[0]);
        for (int i = 0; i < triangles.length - 1; i++) {
            double next = countPerimeter(triangles[i + 1]);
            if (min > next) {
                min = next;
            }
        }
        return min;
    }

    public static boolean findeQuilateralTriangle(Triangle triangle) {
        if ((distanceBetweenPoint(triangle.points[0], triangle.points[1]) == distanceBetweenPoint(triangle.points[1], triangle.points[2]))
                && (distanceBetweenPoint(triangle.points[0], triangle.points[1]) == distanceBetweenPoint(triangle.points[0], triangle.points[2]))) {
            return true;
        }
        return false;
    }

    public static Triangle[] findeQuilateralTriangle(Triangle[] triangle) {
        Triangle[] quilateralTriangleArray = new Triangle[0];
        int i = 0;
        for (Triangle quilateralTriangle : triangle) {
            if (findeQuilateralTriangle(quilateralTriangle) == true) {
                quilateralTriangleArray = arrayResize(quilateralTriangleArray);
                quilateralTriangleArray[i] = quilateralTriangle;
                i++;
            }
        }
        return quilateralTriangleArray;
    }

    public static boolean findeIsoscelesTriangle(Triangle triangle) {
        if ((distanceBetweenPoint(triangle.points[0], triangle.points[1]) == distanceBetweenPoint(triangle.points[1], triangle.points[2]))
                || (distanceBetweenPoint(triangle.points[0], triangle.points[1]) == distanceBetweenPoint(triangle.points[0], triangle.points[2]))
                || (distanceBetweenPoint(triangle.points[1], triangle.points[2]) == distanceBetweenPoint(triangle.points[0], triangle.points[2]))) {
            return true;
        }
        return false;

    }

    public static Triangle[] findeIsoscelesTriangle(Triangle[] triangle) {
        Triangle[] isoscelesTriangleArray = new Triangle[0];
        int i = 0;
        for (Triangle quilateralTriangle : triangle) {
            if (findeIsoscelesTriangle(quilateralTriangle) == true) {
                isoscelesTriangleArray = arrayResize(isoscelesTriangleArray);
                isoscelesTriangleArray[i] = quilateralTriangle;
                i++;
            }
        }
        return isoscelesTriangleArray;

    }

    public static boolean findeRightTriangle(Triangle triangle) {
        if (pow(distanceBetweenPoint(triangle.points[0], triangle.points[1]), 2) == pow(distanceBetweenPoint(triangle.points[1], triangle.points[2]), 2) + pow(distanceBetweenPoint(triangle.points[0], triangle.points[2]), 2)
                || pow(distanceBetweenPoint(triangle.points[1], triangle.points[2]), 2) == pow(distanceBetweenPoint(triangle.points[0], triangle.points[1]), 2) + pow(distanceBetweenPoint(triangle.points[0], triangle.points[2]), 2)
                || pow(distanceBetweenPoint(triangle.points[0], triangle.points[2]), 2) == pow(distanceBetweenPoint(triangle.points[0], triangle.points[1]), 2) + pow(distanceBetweenPoint(triangle.points[1], triangle.points[2]), 2)) {
            return true;
        }
        return false;
    }

    public static Triangle[] findeRightTriangle(Triangle[] triangle) {
        Triangle[] rightTriangleArray = new Triangle[0];
        int i = 0;
        for (Triangle rightTriangle : triangle) {
            if (findeRightTriangle(rightTriangle) == true) {
                rightTriangleArray = arrayResize(rightTriangleArray);
                rightTriangleArray[i] = rightTriangle;
                i++;
            }
        }
        return rightTriangleArray;
    }

    public static Triangle[] findeRandomTriangle(Triangle[] triangle) {
        Triangle[] randomTriangleArray = new Triangle[0];
        int i = 0;
        for (Triangle triangles : triangle) {
            if (findeRightTriangle(triangles) == false && findeIsoscelesTriangle(triangles) == false) {
                randomTriangleArray = arrayResize(randomTriangleArray);
                randomTriangleArray[i] = triangles;
                i++;
            }
        }
        return randomTriangleArray;
    }
}




