package ua.training;

/**
 * Created by Денис on 25.11.2016.
 */
public class RectangleImpl implements Rectangle {
    int a,b;

    public RectangleImpl(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int getB() {
        return b;
    }

    @Override
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int getA() {
        return a;
    }

    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double square() {
        return a*b;
    }
}
