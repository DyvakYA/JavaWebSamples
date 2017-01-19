package ua.training;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
       // new App(2,3);
        new TreeMap( ((o1, o2) -> o2.hashCode() - o1.hashCode())).put(null,null);
    }
}
