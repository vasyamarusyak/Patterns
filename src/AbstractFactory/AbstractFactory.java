package AbstractFactory;

import AbstractFactory.BindedProducts.Car;
import AbstractFactory.BindedProducts.Truck;

public interface AbstractFactory {
    Car createCar();
    Truck createTruck();

}
