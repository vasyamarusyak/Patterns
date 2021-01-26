package FactoryFromBook.FactoryMethod.Stores;

import FactoryFromBook.FactoryMethod.PizzaStyles.*;
import FactoryMethod.PizzaStyles.Pizza;
import FactoryMethod.Stores.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        System.out.println("NYStypePizzaStore is creating");
        Pizza pizza = null;
            if(type.equals("cheese")){
                pizza = new NYStyleCheesePizza();
            } else if(type.equals("papperoni")){
                pizza = new NYStylePapperoniPizza();
            } else if(type.equals("clam")) {
                pizza = new NYStyleClamPizza();
            } else if(type.equals("veggie")) {
                pizza = new NYStyleVeggiePizza();
            }
            return pizza;
    }
}
