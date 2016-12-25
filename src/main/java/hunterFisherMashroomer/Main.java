package hunterFisherMashroomer;

/**
 * Created by Dyvak on 20.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Human fisher = new Fisher();
        fisher.isInCoast();
        Human mushroom = new Mushroomer();
        mushroom.isInPole();
        Human hunter = new Hunter();
        hunter.seeBear();
        Human human2 = new HumanImpl();
        human2.isInPole();
        human2.seeBear();
    }
}
