package airplane;

/**
 * Created by Dyvak on 20.12.2016.
 */
public class AirplaneOne {
    public static void main(String[] args) {
        StrategyClient c = new StrategyClient();

        Airplane a =  new Airplane();
        a.is();
        Airplane a1 = new Flying();
        a1.is();
        Flying f = new Flying();
        f.is();
        c.setStrategy(new Cannon());
        c.executeStrategy(f);
        c.setStrategy(new MachineGun());
        c.executeStrategy(f);
        c.setStrategy(new Rockets());
        c.executeStrategy(f);
    }
}

class StrategyClient{
    Shouting strategy;
    void is(){

    }
    public void setStrategy(Shouting strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(Flying fly){
        strategy.shout(fly);

    }
}

class Airplane{
    void is(){
        System.out.println("airplane on ground");
    }
}

class Flying extends Airplane{
    void is(){
        System.out.println("airplane on air");
    }
}

interface Shouting {
    void shout(Flying fly);
}


class MachineGun implements Shouting{
    public void shout(Flying fly){
        System.out.println("Machine gun");
    }
}

class Cannon implements Shouting{
    @Override
    public void shout(Flying fly){
        System.out.println("Cannon");
    }
}

class Rockets implements Shouting {
    @Override
    public void shout(Flying fly){
        System.out.println("Rockets");
    }
}
