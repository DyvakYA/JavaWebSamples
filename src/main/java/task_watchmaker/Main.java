package task_watchmaker;

/**
 * Created by Dyvak on 02.01.2017.
 */
public class Main {
    public static void main(String[] args) {

        WatchMaker maker = new RomeWatchMaker();
        Watch watch = maker.createWatch();
        watch.showTime();
    }
}
