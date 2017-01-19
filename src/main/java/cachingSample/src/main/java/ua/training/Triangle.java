package ua.training;

/**
 * Created by Денис on 25.11.2016.
 */
public class Triangle implements Shape {
    double a,b,c;

    private double squareValue = -1;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        squareValue =-1;
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        squareValue = -1;
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        squareValue = -1;
        this.c = c;
    }

    private double calcSquare() {
        return a+b+c;
    }

    public double square() {
        if( squareValue == -1){
            squareValue = calcSquare();
        }
        return squareValue;
    }
}
