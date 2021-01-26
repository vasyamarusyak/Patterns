package FactoryFromBook.FactoryMethod.Stores;

import FactoryFromBook.FactoryMethod.PizzaStyles.*;
import FactoryMethod.PizzaStyles.Pizza;
import FactoryMethod.Stores.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        System.out.println("ChicagoStylePizzaStore is creating");
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        } else if(type.equals("papperoni")){
            pizza = new ChicagoStylePapperoniPizza();
        } else if(type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if(type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
