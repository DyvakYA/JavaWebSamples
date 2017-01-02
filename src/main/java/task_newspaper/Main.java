package task_newspaper;

/**
 * Created by Dyvak on 02.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Subscriber sub = new Sub1("nick");

        sub.addSubscriber(new ConcreteNewsPeper());

        sub.pitch();
    }
}
