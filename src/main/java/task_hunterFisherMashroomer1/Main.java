package task_hunterFisherMashroomer1;

/**
 * Created by Dyvak on 20.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        Prof hunter = new Hunter();
        Human mike = new Human();
        mike.setProf(hunter);
        mike.act();
    }
}
