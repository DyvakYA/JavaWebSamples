package task_hunterFisherMashroomer2;

/**
 * Created by Dyvak on 02.01.2017.
 */
public class Main {
    public static void main(String[] args) {

        StrategyClient c = new StrategyClient();

        Prof hunter = new Fisher();
        c.setStrategy(new SeeBear());
        c.setProf(hunter);

    }
}
