package FactoryFromBook.AbstractFactory;

import FactoryFromBook.AbstractFactory.PizzaStyles.Pizza;
import FactoryFromBook.AbstractFactory.Stores.ChicagoStylePizzaStore;
import FactoryFromBook.AbstractFactory.Stores.NYStylePizzaStore;
import FactoryFromBook.AbstractFactory.Stores.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();


        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

//        pizza = nyStore.orderPizza("clam");
//        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
//
//        pizza = chicagoStore.orderPizza("clam");
//        System.out.println("Joel ordered a " + pizza.getName() + "\n");
//
//        pizza = nyStore.orderPizza("pepperoni");
//        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
//
//        pizza = chicagoStore.orderPizza("pepperoni");
//        System.out.println("Joel ordered a " + pizza.getName() + "\n");
//
//        pizza = nyStore.orderPizza("veggie");
//        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
//
//        pizza = chicagoStore.orderPizza("veggie");
//        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
