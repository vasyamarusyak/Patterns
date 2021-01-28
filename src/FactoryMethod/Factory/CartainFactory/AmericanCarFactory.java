package FactoryMethod.Factory.CartainFactory;

import FactoryMethod.Car.AbstractCar.Car;
import FactoryMethod.Car.CertainCarStyle.AmericanStyleCar;
import FactoryMethod.Factory.AbstractFactory.CarFactory;
import FactoryMethod.CarType;

public class AmericanCarFactory extends CarFactory {

        @Override
        public Car createCar (CarType type) {
           Car car = null;
            switch (type) {
                case TRUCK:
                    car = new AmericanStyleCar();
                    System.out.println("Tamplate of American Style TRUCK is created");
                    break;
                case SEDAN:
                    car = new AmericanStyleCar();
                    System.out.println("Tamplate of American Style SEDAN is created");
                    break;
            }
            return car;
        }
    }
