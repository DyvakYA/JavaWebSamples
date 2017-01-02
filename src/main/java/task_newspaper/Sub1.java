package task_newspaper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dyvak on 02.01.2017.
 */
public class Sub1 implements Subscriber {

    String name;

    List<NewsPaper> subscribers = new ArrayList<>();

    public Sub1(String name) {
        this.name = name;
    }

    @Override
    public void addSubscriber(NewsPaper sub) {
        subscribers.add(sub);
    }

    @Override
    public void removeSubscriber(NewsPaper sub) {
        subscribers.remove(sub);
    }

    @Override
    public void pitch() {
        for (NewsPaper subscriber: subscribers){
            subscriber.handleEvent(name);
        }
    }
}
