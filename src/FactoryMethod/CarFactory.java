package FactoryMethod;

public abstract class CarFactory {

    public Car orderCar(CarType type) {
        Car truckCar = createCar(type);

        truckCar.makeWheels();
        truckCar.makeCarsBody();

        System.out.println("Here is your Truck FactoryMethod Car");
        return truckCar;
    }

    protected abstract Car createCar(CarType type);
}
