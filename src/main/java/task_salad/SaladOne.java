package task_salad;

/**
 * Created by Dyvak on 20.12.2016.
 */
public class SaladOne {
    public static void main(String[] args) {
        Salad salad = new SaladBuilderOne()
                .buildSeasoning(Seasoning.SALT)
                .buildOil(Oil.OLIVE)
                .buildVegetables(Vegetables.CUCUMBER,Vegetables.TOMATO)
                .build();
        System.out.println(salad);
    }
}

enum Seasoning{
    PEPER, SALT
}

enum Oil{
    OLIVE, SUNFLOVER, VINEGAR
}

enum Vegetables{
    CUCUMBER, TOMATO, POTATO
}

class Salad{
    Seasoning seasoning;
    Oil oil;
    Vegetables v1;
    Vegetables v2;

    public void setSeasoning(Seasoning seasoning) {
        this.seasoning = seasoning;
    }

    public void setOil(Oil oil) {
        this.oil = oil;
    }

    public void setVegetables(Vegetables v1, Vegetables v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "seasoning=" + seasoning +
                ", oil=" + oil +
                ", vegetables=" + v1 +
                ", vegetables=" + v2 +
                '}';
    }
}

class SaladBuilderOne {
    Seasoning s;
    Oil o;
    Vegetables v1;
    Vegetables v2;



    SaladBuilderOne buildSeasoning(Seasoning s) {
        this.s = s;
        return this;
    }

    SaladBuilderOne buildOil(Oil o) {
        this.o = o;
        return this;
    }

    SaladBuilderOne buildVegetables(Vegetables v1, Vegetables v2) {
        this.v1 = v1;
        this.v2 = v2;
        return this;
    }

    Salad build() {
        Salad car = new Salad();
        car.setSeasoning(s);
        car.setOil(o);
        car.setVegetables(v1, v2);
        return car;
    }
}
