package FactoryMethod;

public class EuropeanCarFactory extends CarFactory {

    @Override
    public Car createCar (CarType type) {
        Car car = null;
        switch (type) {
            case TRUCK:
                car = new EuropeanStyleCar();
                break;
            case SEDAN:
                car = new EuropeanStyleCar();
                break;
        }
        return car;
    }
}