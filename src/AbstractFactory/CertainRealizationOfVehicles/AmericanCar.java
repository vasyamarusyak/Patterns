package AbstractFactory.CertainRealizationOfVehicles;
import AbstractFactory.BindedProducts.Car;

public class AmericanCar implements Car {
    @Override
    public void pullingCar() {
        System.out.println("My American car is broken. I have to pull it");
    }
}
