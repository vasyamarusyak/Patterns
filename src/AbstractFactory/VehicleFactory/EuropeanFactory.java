package AbstractFactory.VehicleFactory;

import AbstractFactory.BindedProducts.Bike;
import AbstractFactory.BindedProducts.Car;
import AbstractFactory.BindedProducts.Truck;
import AbstractFactory.CertainRealizationOfVehicles.EuropeanBike;
import AbstractFactory.CertainRealizationOfVehicles.EuropeanCar;
import AbstractFactory.CertainRealizationOfVehicles.EuropeanTruck;

public class EuropeanFactory implements AbstractFactory {
    @Override
    public Car createCar() {
        System.out.println("Creating Car from European Factory");
        return new EuropeanCar();
    }

    @Override
    public Truck createTruck() {
        System.out.println("Creating Truck from European Factory");
        return new EuropeanTruck();
    }

    @Override
    public Bike createBike() {
        System.out.println("Creating Bike from European Factory");
        return new EuropeanBike();
    }
}
