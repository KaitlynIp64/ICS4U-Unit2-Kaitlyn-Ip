/**
 *  * Class that defines a triangle.
 *   *
 *    * @author Kaitlyn Ip
 *     * @version 1.0
 *      * @since 2024-01-01
 *       */
public class Triangle {
            private double[] sides;
            // Constructor
            public Triangle(double aSide, double bSide, double cSide) {
                this.sides = new double[3];
                this.sides[0] = aSide;
                this.sides[1] = bSide;
                this.sides[2] = cSide;
            }

            // Getters for side lengths
            public double getASide() {
                return this.sides[0];
            }
            public double getBSide() {
                return this.sides[1];
            }
            public double getCSide() {
                return this.sides[2];
            }
            // Return angle
            public double angle(int angleNumber) {
                angleNumber = (angleNumber - 1) % 3; // 1-3 to 0-2
                double aSide = this.sides[angleNumber];
                double bSide = this.sides[(angleNumber + 1) % 3];
                double cSide = this.sides[(angleNumber + 2) % 3]; // wrap to lower bound
                double angle = -1;
                if (isValid()) {
                   angle = Math.acos((Math.pow(bSide, 2) + Math.pow(cSide, 2) - Math.pow(aSide, 2)) / (2 * bSide * cSide));
                }
                return angle;
            }
            // Return triangle area
            public double area() {
                double area = -1;
                if (isValid()) {
                   double s = semiPerimeter();
                   area = Math.sqrt(s * (s - getASide()) * (s - getBSide()) * (s - getCSide()));
                }
                return area;
            }
            // Return triangle circumcircle radius
            public double circumcircleRadius() {
                double circumcircle = -1;
                if (isValid()) {
                   circumcircle = (getASide() * getBSide() * getCSide()) / (4 * area());
                return circumcircle;
            }
            // Find type of triangle
            public String getType() {
                String type = "-1";
                if (isValid()) {
                    if (getASide() == getBSide() && getASide() == getCSide()) {
                        type = "Equilateral Triangle";
                    } else if (getASide() == getBSide() || getBSide() == getCSide() || getCSide() == getASide()) {
                        type = "Isosceles Triangle";
                    } else if (Math.pow(getASide(), 2) + Math.pow(getBSide(), 2) == Math.pow(getCSide(), 2) ||
                        Math.pow(getBSide(), 2) + Math.pow(getCSide(), 2) == Math.pow(getASide(), 2) ||
                        Math.pow(getCSide(), 2) + Math.pow(getASide(), 2) == Math.pow(getBSide(), 2)) {                                                                                                                                                                         
                        type = "Right Triangle";
                    } else {
                        type = "Scalene Triangle";
                    }
                }
                return type;
            }
            // Return triangle height
            public double height(int sideNumber) {
                double height = -1;
                if (isValid()) {
                    height = (2 * area()) / this.sides[sideNumber - 1]; // 1-3 to 0-2
                }
                return height;
            }
            // Return triangle inner circle radius
            public double innerCircleRadius() {
                double innerCircleRadius = -1;
                if (isValid()) {
                    innerCircleRadius = area() / semiPerimeter();
                }
                return innerCircleRadius;
            }

            // Check if triangle is valid
            public boolean isValid() {
                return getASide() + getBSide() > getCSide()
                    && getBSide() + getCSide() > getASide()
                    && getCSide() + getASide() > getBSide();
                }

                // Return triangle semiperimeter
                public double semiPerimeter() {
                    double value = -1;
                    if (isValid()) {
                       value = (getASide() + getBSide() + getCSide()) / 2;
                    }
                    return value;
                }
            }
}