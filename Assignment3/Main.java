/**
 * Class that defines airplane speed.
 * 
 * Author: Kaitlyn Ip
 * Version: 1.0
 * Since: 2024-04-09
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println();
       Triangle testTriangle1 = new Triangle(3, 4, 5);
           System.out.println("Created a 3 mm by 4 mm by 5 mm triangle.");
           System.out.println(" → Is the triangle valid: " + testTriangle1.isValid());
           System.out.println(" → Semiperimeter: " + String.format("%.4f", testTriangle1.semiPerimeter()) + " mm");
           System.out.println(" → Area: " + String.format("%.4f", testTriangle1.area()) + " mm²");
           System.out.println(" → Type: " + testTriangle1.getType());
           System.out.println(" → Angle 1: " + String.format("%.4f", testTriangle1.angle(1)) + " rad");
           System.out.println(" → Angle 2: " + String.format("%.4f", testTriangle1.angle(2)) + " rad");
           System.out.println(" → Angle 3: " + String.format("%.4f", testTriangle1.angle(3)) + " rad");
           System.out.println(" → Height 1: " + String.format("%.4f", testTriangle1.height(1)) + " mm");
           System.out.println(" → Height 2: " + String.format("%.4f", testTriangle1.height(2)) + " mm");
           System.out.println(" → Height 3: " + String.format("%.4f", testTriangle1.height(3)) + " mm");
           System.out.println(" → Inner circle radius: " + String.format("%.4f", testTriangle1.innerCircleRadius()) + " mm");
           System.out.println(" → Circumcircle radius: " + String.format("%.4f", testTriangle1.circumsicleRadius()) + " mm");
           System.out.println();
       Triangle testTriangle2 = new Triangle(3, 3, 3);
           System.out.println("Created a 3 mm by 3 mm by 3 mm triangle.");
           System.out.println(" → Is the triangle valid: " + testTriangle2.isValid());
           System.out.println(" → Semiperimeter: " + String.format("%.4f", testTriangle2.semiPerimeter()) + " mm");
           System.out.println(" → Area: " + String.format("%.4f", testTriangle2.area()) + " mm²");
           System.out.println(" → Type: " + testTriangle2.getType());
           System.out.println(" → Angle 1: " + String.format("%.4f", testTriangle2.angle(1)) + " rad");
           System.out.println(" → Angle 2: " + String.format("%.4f", testTriangle2.angle(2)) + " rad");
           System.out.println(" → Angle 3: " + String.format("%.4f", testTriangle2.angle(3)) + " rad");
           System.out.println(" → Height 1: " + String.format("%.4f", testTriangle2.height(1)) + " mm");
           System.out.println(" → Height 2: " + String.format("%.4f", testTriangle2.height(2)) + " mm");
           System.out.println(" → Height 3: " + String.format("%.4f", testTriangle2.height(3)) + " mm");
           System.out.println(" → Inner circle radius: " + String.format("%.4f", testTriangle2.innerCircleRadius()) + " mm");
           System.out.println(" → Circumcircle radius: " + String.format("%.4f", testTriangle2.circumsicleRadius()) + " mm");
           System.out.println();
       Triangle testTriangle3 = new Triangle(3, 4, 4);
           System.out.println("Created a 3 mm by 4 mm by 4 mm triangle.");
           System.out.println(" → Is the triangle valid: " + testTriangle3.isValid());
           System.out.println(" → Semiperimeter: " + String.format("%.4f", testTriangle3.semiPerimeter()) + " mm");
           System.out.println(" → Area: " + String.format("%.4f", testTriangle3.area()) + " mm²");
           System.out.println(" → Type: " + testTriangle3.getType());
           System.out.println(" → Angle 1: " + String.format("%.4f", testTriangle3.angle(1)) + " rad");
           System.out.println(" → Angle 2: " + String.format("%.4f", testTriangle3.angle(2)) + " rad");
           System.out.println(" → Angle 3: " + String.format("%.4f", testTriangle3.angle(3)) + " rad");
           System.out.println(" → Height 1: " + String.format("%.4f", testTriangle3.height(1)) + " mm");
           System.out.println(" → Height 2: " + String.format("%.4f", testTriangle3.height(2)) + " mm");
           System.out.println(" → Height 3: " + String.format("%.4f", testTriangle3.height(3)) + " mm");
           System.out.println(" → Inner circle radius: " + String.format("%.4f", testTriangle3.innerCircleRadius()) + " mm");
           System.out.println(" → Circumcircle radius: " + String.format("%.4f", testTriangle3.circumsicleRadius()) + " mm");
           System.out.println();

       Triangle testTriangle4 = new Triangle(2, 3, 4);
           System.out.println("Created a 2 mm by 3 mm by 4 mm triangle.");
           System.out.println(" → Is the triangle valid: " + testTriangle4.isValid());
           System.out.println(" → Semiperimeter: " + String.format("%.4f", testTriangle4.semiPerimeter()) + " mm");
           System.out.println(" → Area: " + String.format("%.4f", testTriangle4.area()) + " mm²");
           System.out.println(" → Type: " + testTriangle4.getType());
           System.out.println(" → Angle 1: " + String.format("%.4f", testTriangle4.angle(1)) + " rad");
           System.out.println(" → Angle 2: " + String.format("%.4f", testTriangle4.angle(2)) + " rad");
           System.out.println(" → Angle 3: " + String.format("%.4f", testTriangle4.angle(3)) + " rad");
           System.out.println(" → Height 1: " + String.format("%.4f", testTriangle4.height(1)) + " mm");
           System.out.println(" → Height 2: " + String.format("%.4f", testTriangle4.height(2)) + " mm");
           System.out.println(" → Height 3: " + String.format("%.4f", testTriangle4.height(3)) + " mm");
           System.out.println(" → Inner circle radius: " + String.format("%.4f", testTriangle4.innerCircleRadius()) + " mm");
           System.out.println(" → Circumcircle radius: " + String.format("%.4f", testTriangle4.circumsicleRadius()) + " mm");
           System.out.println();

    Triangle testTriangle5 = new Triangle(23, 3, 4);
           System.out.println("Created a 23 mm by 3 mm by 4 mm triangle.");
           System.out.println(" → Is the triangle valid: " + testTriangle5.isValid());
           System.out.println(" → Semiperimeter: " + String.format("%.4f", testTriangle5.semiPerimeter()) + " mm");
           System.out.println(" → Area: " + String.format("%.4f", testTriangle5.area()) + " mm²");
           System.out.println(" → Type: " + testTriangle5.getType());
           System.out.println(" → Angle 1: " + String.format("%.4f", testTriangle5.angle(1)) + " rad");
           System.out.println(" → Angle 2: " + String.format("%.4f", testTriangle5.angle(2)) + " rad");
           System.out.println(" → Angle 3: " + String.format("%.4f", testTriangle5.angle(3)) + " rad");
           System.out.println(" → Height 1: " + String.format("%.4f", testTriangle5.height(1)) + " mm");
           System.out.println(" → Height 2: " + String.format("%.4f", testTriangle5.height(2)) + " mm");
           System.out.println(" → Height 3: " + String.format("%.4f", testTriangle5.height(3)) + " mm");
           System.out.println(" → Inner circle radius: " + String.format("%.4f", testTriangle5.innerCircleRadius()) + " mm");
           System.out.println(" → Circumcircle radius: " + String.format("%.4f", testTriangle5.circumsicleRadius()) + " mm");
           System.out.println();
    }
}
