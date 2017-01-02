package task_pizza;

/**
 * Created by Dyvak on 20.12.2016.
 */
class PizzaOne {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilderOne()
                .buildSeasoning(Seasoning.SALT)
                .buildOil(Oil.OLIVE)
                .buildVegetables(Vegetables.CUCUMBER, Vegetables.TOMATO)
                .build();
        System.out.println(pizza);
    }
}

enum Seasoning{
    PEPER(2.00),
    SALT (5.00);

    Seasoning(double v) {

    }
}

enum Oil{
    OLIVE(3.00),
    SUNFLOVER(4.90),
    VINEGAR(5.99);

    Oil(double v) {

    }
}

enum Vegetables{
    CUCUMBER(1.90),
    TOMATO(2.50),
    POTATO(3.20);

    Vegetables(double v) {

    }
}

class Pizza {
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

class PizzaBuilderOne {
    Seasoning s;
    Oil o;
    Vegetables v1;
    Vegetables v2;



    PizzaBuilderOne buildSeasoning(Seasoning s) {
        this.s = s;
        return this;
    }

    PizzaBuilderOne buildOil(Oil o) {
        this.o = o;
        return this;
    }

    PizzaBuilderOne buildVegetables(Vegetables v1, Vegetables v2) {
        this.v1 = v1;
        this.v2 = v2;
        return this;
    }

    Pizza build() {
        Pizza car = new Pizza();
        car.setSeasoning(s);
        car.setOil(o);
        car.setVegetables(v1, v2);
        return car;
    }
}
