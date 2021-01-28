package FactoryMethod.Factory.CartainFactory;

import FactoryMethod.Car.AbstractCar.Car;
import FactoryMethod.Car.CertainCarStyle.EuropeanStyleCar;
import FactoryMethod.Factory.AbstractFactory.CarFactory;
import FactoryMethod.CarType;

public class EuropeanCarFactory extends CarFactory {

    @Override
    public Car createCar (CarType type) {
        Car car = null;
        switch (type) {
            case TRUCK:
                car = new EuropeanStyleCar();
                System.out.println("Tamplate of European Style TRUCK is created");
                break;
            case SEDAN:
                car = new EuropeanStyleCar();
                System.out.println("Tamplate of European Style SEDAN is created");
                break;
        }
        return car;
    }
}