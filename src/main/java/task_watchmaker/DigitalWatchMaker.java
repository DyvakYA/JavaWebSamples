package task_watchmaker;

/**
 * Created by Dyvak on 02.01.2017.
 */
public class DigitalWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
