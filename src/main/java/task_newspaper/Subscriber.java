package task_newspaper;

/**
 * Created by Dyvak on 02.01.2017.
 */
public interface Subscriber {
    void addSubscriber(NewsPaper sub);
    void removeSubscriber(NewsPaper sub);
    void pitch();
}
