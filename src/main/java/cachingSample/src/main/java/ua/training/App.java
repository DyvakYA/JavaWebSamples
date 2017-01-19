package ua.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ArrayList<Shape> shapes = new ArrayList<Shape>(
                Arrays.asList( new Triangle(1,2,3),
                               new Triangle(2,3,4),
                                new RectangleImpl(3,4) ,
                               new RectangleDecorator( new RectangleImpl(5,6) ),
                                new NormalRectangleDecorator(
                                    new RectangleImpl(1,1)
                                ))
        );

        //shapes.sort(Comparator.comparing( Shape::square));
        shapes.sort(new Comparator<Shape>() {
            HashMap<Shape , Double> squares = new HashMap<Shape, Double>();
            @Override
            public int compare(Shape o1, Shape o2) {
                Double square1 = null;
                if( (square1 = squares.get(o1)) == null ){
                    square1 = o1.square();
                    squares.put(o1,square1);
                }

                Double square2 = null;
                if( (square2 = squares.get(o2)) == null ){
                    square2 = o2.square();
                    squares.put(o2,square1);
                }
                
                return  (int)Math.signum( square2 - square1 );
            }
        });
        //System.out.println(shapes);
        shapes.stream().map( x -> x.square()).forEach( System.out::println);
    }
}
