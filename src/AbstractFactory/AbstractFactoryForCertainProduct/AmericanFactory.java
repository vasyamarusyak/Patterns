package AbstractFactory.AbstractFactoryForCertainProduct;

import AbstractFactory.AbstractFactory;
import AbstractFactory.BindedProducts.Car;
import AbstractFactory.BindedProducts.Truck;
import AbstractFactory.DifferentRealizationOfProducts.AmericanCar;
import AbstractFactory.DifferentRealizationOfProducts.AmericanTruck;

public class AmericanFactory implements AbstractFactory  {
    @Override
    public Car createCar() {
        System.out.println("Creating Car from American Factory");
        return new AmericanCar();
    }

    @Override
    public Truck createTruck() {
        System.out.println("Creating Truck from American Factory");
        return new AmericanTruck();
    }
}
