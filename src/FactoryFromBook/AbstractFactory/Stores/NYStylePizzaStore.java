package FactoryFromBook.AbstractFactory.Stores;

import AbstractFactory.CheesePizza;
import FactoryFromBook.AbstractFactory.ClamPizza;
import FactoryFromBook.AbstractFactory.NYPizzaIngredientFactory;
import FactoryFromBook.AbstractFactory.PizzaIngredientFactory;
import FactoryFromBook.AbstractFactory.PizzaStyles.*;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

      //  } else if (item.equals("veggie")) {

//            pizza = new VeggiePizza(ingredientFactory);
//            pizza.setName("New York Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

       // } else if (item.equals("pepperoni")) {

//            pizza = new PepperoniPizza(ingredientFactory);
//            pizza.setName("New York Style Pepperoni Pizza");

        }
        return pizza;
    }
}
