package FactoryMethod.Factory.AbstractFactory;

import FactoryMethod.Car.AbstractCar.Car;
import FactoryMethod.CarType;

public abstract class CarFactory {

    public Car getCar(CarType type) {
        Car car = null;
        car = createCar(type);
        car.makeWheels();
        car.makeCarsBody();
        car.release();
        return car;
    }

    protected abstract Car createCar(CarType type);
}
