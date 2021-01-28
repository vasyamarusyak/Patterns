package FactoryMethod;

import FactoryMethod.Car.AbstractCar.Car;
import FactoryMethod.Factory.AbstractFactory.CarFactory;
import FactoryMethod.Factory.CartainFactory.AmericanCarFactory;
import FactoryMethod.Factory.CartainFactory.EuropeanCarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory europeanCarFactory = new EuropeanCarFactory();
        CarFactory americanCarFactory = new AmericanCarFactory();

        europeanCarFactory.getCar(CarType.TRUCK);
        europeanCarFactory.getCar(CarType.SEDAN);
        americanCarFactory.getCar(CarType.TRUCK);
        americanCarFactory.getCar(CarType.SEDAN);
    }
}
