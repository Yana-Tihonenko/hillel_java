package HW6;

import static HW6.СalculatePoint.*;
import static HW6.СalculateTriangle.*;
import static HW6.Triangle.*;


public class Main {

    public static void main(String[] args) {

        Triangle trianglesArray[] = new Triangle[6];
        trianglesArray[0] = new Triangle(new Point[]{new Point(1, 0), new Point(1, 4), new Point(4, 2)});
        trianglesArray[1] = new Triangle(new Point[]{new Point(2, 6), new Point(5, 6), new Point(2, 10)});
        trianglesArray[2] = new Triangle(new Point[]{new Point(1, 1), new Point(4, 3), new Point(1, 4)});
        trianglesArray[3] = new Triangle(new Point[]{new Point(4, 5), new Point(6, 7), new Point(1, 8)});
        trianglesArray[4] = new Triangle(new Point[]{new Point(2, 3), new Point(5, 6), new Point(2, 9)});
        trianglesArray[5] = new Triangle(new Point[]{new Point(3, 5), new Point(7, 5), new Point(3, 13)});

        //print perimeter triangle
        for (int i = 0; i < trianglesArray.length; i++) {
            System.out.println("Perimeter triangle" + i + " " + countPerimeter(trianglesArray[i]));
        }

        //print Square triangle
        for (int i = 0; i < trianglesArray.length; i++) {
            System.out.println("Square triangle" + i + " " + countSquare(trianglesArray[i]));
        }

        //print find count Quilateral Triangle
        Triangle[] quilateralTriangle = findeQuilateralTriangle(trianglesArray);
        System.out.println("find Quilateral triangle count " + quilateralTriangle.length);

        //print  find count Isosceles Triangle
        Triangle[] isoscelesTriangle = findeIsoscelesTriangle(trianglesArray);
        System.out.println("find Isosceles triangle count " + isoscelesTriangle.length);

        //print find count Right Triangle
        Triangle[] rightTriangle = findeRightTriangle(trianglesArray);
        System.out.println("find Right triangle count " + rightTriangle.length);

        //print find count Random Triangle
        Triangle[] randomTriangle = findeRandomTriangle(trianglesArray);
        System.out.println("find Random triangle count " + randomTriangle.length);

        if (quilateralTriangle.length > 0) {
            //print find max Perimeter in Quilateral Triangle
            System.out.println("Max Perimeter in Quilateral Triangle " + calculateMaxPerimeter(quilateralTriangle));
            //print find min Perimeter in Quilateral Triangle
            System.out.println("Min Perimeter in Quilateral Triangle " + calculateMinPerimeter(quilateralTriangle));
        }

        if (isoscelesTriangle.length > 0) {
            //print find max Perimeter in Isosceles Triangle
            System.out.println("Max Perimeter in Isosceles Triangle " + calculateMaxPerimeter(isoscelesTriangle));
            //print find min Perimeter in Isosceles Triangle
            System.out.println("Min Perimeter in Isosceles Triangle " + calculateMinPerimeter(isoscelesTriangle));
        }

        if (rightTriangle.length > 0) {
            //print find max Perimeter in Right Triangle
            System.out.println("Max Perimeter in Right Triangle " + calculateMaxPerimeter(rightTriangle));
            //print find min Perimeter in Right Triangle
            System.out.println("Min Perimeter in Right Triangle " + calculateMinPerimeter(rightTriangle));
        }

        if (randomTriangle.length > 0) {
            //print find max Perimeter in Random Triangle
            System.out.println("Max Perimeter in Random Triangle " + calculateMaxPerimeter(randomTriangle));
            //print find min Perimeter in Random Triangle
            System.out.println("Min Perimeter in Random Triangle " + calculateMinPerimeter(randomTriangle));
        }

    }
}
