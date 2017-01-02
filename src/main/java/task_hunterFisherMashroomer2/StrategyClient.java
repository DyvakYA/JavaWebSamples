package task_hunterFisherMashroomer2;

/**
 * Created by Dyvak on 02.01.2017.
 */
public class StrategyClient {

    Activity activity;

    public void setStrategy (Activity activity) {
        this.activity = activity;
    }

    public void setProf(Prof prof) {
        activity.act(prof);
    }
}
