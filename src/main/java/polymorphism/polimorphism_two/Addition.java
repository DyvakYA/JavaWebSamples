package polymorphism.polimorphism_two;

/**
 * Created by User on 05.04.2016.
 */
public class Addition extends Operation{
    @Override
    public int calculate(int valueA, int valueB) {
        return valueA+valueB;
    }
}
