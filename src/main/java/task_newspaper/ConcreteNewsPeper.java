package task_newspaper;

/**
 * Created by Dyvak on 02.01.2017.
 */
public class ConcreteNewsPeper implements NewsPaper {

    @Override
    public void handleEvent(String name) {
        System.out.println("got newspape" + name);
    }
}
