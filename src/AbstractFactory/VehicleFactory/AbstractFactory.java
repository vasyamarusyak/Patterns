package AbstractFactory.VehicleFactory;

import AbstractFactory.BindedProducts.Bike;
import AbstractFactory.BindedProducts.Car;
import AbstractFactory.BindedProducts.Truck;

public interface AbstractFactory {
    Car createCar();
    Truck createTruck();
    Bike createBike();

}
