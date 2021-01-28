package AbstractFactory.CertainRealizationOfVehicles;

import AbstractFactory.BindedProducts.Car;

public class EuropeanCar implements Car {
    public void pullingCar() {
        System.out.println("My European car is broken. My friend will pull it");
    }
}
