package ua.training;

import java.util.Objects;

/**
 * Created by Денис on 25.11.2016.
 */
public class NormalRectangleDecorator implements Rectangle {
    Rectangle rectangle;
    double squareValue=-1;

    public NormalRectangleDecorator(Rectangle rectangle) {
        Objects.requireNonNull(rectangle);
        this.rectangle = rectangle;
    }

    @Override
    public int getB() {
        return rectangle.getB();
    }



    @Override
    public int getA() {
        return 0;
    }



    @Override
    public void setB(int b) {
        squareValue = -1;
        rectangle.setB(b);
    }

    @Override
    public void setA(int a) {
        squareValue = -1;
        rectangle.setA(a);
    }

    @Override
    public double square() {
        if(squareValue == -1) {
            squareValue = rectangle.square();

        }
        return squareValue;
    }

}
