package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        CarFactory europeanCarFactory = new EuropeanCarFactory();
        europeanCarFactory.orderCar(CarType.TRUCK);

        CarFactory americanCarFactory = new AmericanCarFactory();
        americanCarFactory.orderCar(CarType.TRUCK);
    }
}
