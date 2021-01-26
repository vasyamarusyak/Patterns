package FactoryFromBook.AbstractFactory.Stores;

import FactoryFromBook.AbstractFactory.PizzaStyles.Pizza;

public abstract class PizzaStore {
   //public static NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
//    static PizzaStore nyPizzaStore = new NYStylePizzaStore();
//    static PizzaStore chPizzaStore = new ChicagoStylePizzaStore();

    //    SimplePizzaFactory factory;
//    public static SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
//    static PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
//    public PizzaStore(SimplePizzaFactory factory) {
//        this.factory = factory;
//    }
    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);

}

