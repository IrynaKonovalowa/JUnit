package org.junit;


public class Figure {
    public static double getAreaRectangle(double a, double b) {
        return a*b;
    }
    public static double getAreaSquare(double a) {
        return a*a;
    }
    public static double getAreaTriangle(double a, double h) {
        return a*h/2;
    }
    public static double getAreaDiamond(double a, double h) {
        return a*h;
    }
}
