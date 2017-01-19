package ua.training;

/**
 * Created by Денис on 25.11.2016.
 */
public class RectangleDecorator extends RectangleImpl {

    double squareValue = -1;
    public RectangleDecorator( RectangleImpl parent ){
        super(parent.a , parent.b);
    }

    @Override
    public void setB(int b) {
        squareValue = -1;
        super.setB(b);
    }

    @Override
    public void setA(int a) {
        squareValue = -1;
        super.setA(a);
    }

    @Override
    public double square() {
        if(squareValue == -1) {
            squareValue = super.square();

        }
        return squareValue;
    }
}
