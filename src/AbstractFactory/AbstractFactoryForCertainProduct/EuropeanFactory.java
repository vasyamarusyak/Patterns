package AbstractFactory.AbstractFactoryForCertainProduct;

import AbstractFactory.AbstractFactory;
import AbstractFactory.BindedProducts.Car;
import AbstractFactory.BindedProducts.Truck;
import AbstractFactory.DifferentRealizationOfProducts.EuropeanCar;
import AbstractFactory.DifferentRealizationOfProducts.EuropeanTruck;

public class EuropeanFactory implements AbstractFactory {
    @Override
    public Car createCar() {
        System.out.println("Creating Car from European Factory");
        return new EuropeanCar();
    }

    @Override
    public Truck createTruck() {
        System.out.println("Creating Truck from European Factory");
        return new EuropeanTruck();
    }

}
