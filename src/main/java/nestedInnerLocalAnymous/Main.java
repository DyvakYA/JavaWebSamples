package nestedInnerLocalAnymous;

import nestedInnerLocalAnymous.model.Car;
import nestedInnerLocalAnymous.model.ElectroCar;

public class Main {

    public static void main(String[] args) {
        Car.Charger charger = new Car.Charger("XXXCharger" , 20 , null );
        //null for car instance
        Car car = new Car( "bmw" , "black" , "100500AA" ,  charger , Car.BodyType.SEDAN );
        Car.Engine engine = car.new Engine(250 , Car.FuelType.GASOLINE);
        car.setEngine(engine);
        System.out.println(car);
        Car tesla = new ElectroCar("tesla" , "white" , "50001" , charger , Car.BodyType.SEDAN , 500 );
        System.out.println(tesla);
    }
}