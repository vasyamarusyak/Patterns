package AbstractFactory;

import AbstractFactory.BindedProducts.Car;
import AbstractFactory.BindedProducts.Truck;

public class CreateCertainFamily {
    protected final Car createCar;
    protected final Truck createTruck;

    public CreateCertainFamily(AbstractFactory factory) {
        createCar = factory.createCar();
        createTruck = factory.createTruck();
    }
}
