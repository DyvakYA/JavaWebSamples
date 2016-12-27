package polymorphism.polimorphism_two;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Operation o1 = new Addition();
        System.out.println(o1.calculate(5, 3));
        o1 = new Subtraction();
        System.out.println(o1.calculate(5, 3));
    }
}
