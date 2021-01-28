package AbstractFactory.VehicleFactory;

import AbstractFactory.BindedProducts.Bike;
import AbstractFactory.BindedProducts.Car;
import AbstractFactory.BindedProducts.Truck;
import AbstractFactory.CertainRealizationOfVehicles.AmericanBike;
import AbstractFactory.CertainRealizationOfVehicles.AmericanCar;
import AbstractFactory.CertainRealizationOfVehicles.AmericanTruck;

public class AmericanFactory implements AbstractFactory  {
    @Override
    public Car createCar() {
        System.out.println("Creating Car from American Factory");
        return new AmericanCar();
    }

    @Override
    public Truck createTruck() {
        System.out.println("Creating Truck from American Factory");
        return new AmericanTruck();
    }

    @Override
    public Bike createBike() {
        System.out.println("Creating BIke from American Factory");
        return new AmericanBike();
    }
}
