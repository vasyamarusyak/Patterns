package FactoryMethod;

public class AmericanCarFactory extends CarFactory {

        @Override
        public Car createCar (CarType type) {
           Car car = null;
            switch (type) {
                case TRUCK:
                    car = new AmericanStyleCar();
                    break;
                case SEDAN:
                    car = new AmericanStyleCar();
                    break;
            }
            return car;
        }
    }
