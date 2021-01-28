package FactoryMethod;

import FactoryMethod.Car.AbstractCar.Car;
import FactoryMethod.Factory.AbstractFactory.CarFactory;
import FactoryMethod.Factory.CartainFactory.AmericanCarFactory;
import FactoryMethod.Factory.CartainFactory.EuropeanCarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory europeanCarFactory = new EuropeanCarFactory();
        CarFactory americanCarFactory = new AmericanCarFactory();

        Car car = europeanCarFactory.getCar(CarType.TRUCK);
        car = europeanCarFactory.getCar(CarType.SEDAN);
        car = americanCarFactory.getCar(CarType.TRUCK);
        car = americanCarFactory.getCar(CarType.SEDAN);
    }
}
