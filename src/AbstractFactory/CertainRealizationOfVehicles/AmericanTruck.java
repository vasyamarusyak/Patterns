package AbstractFactory.CertainRealizationOfVehicles;

import AbstractFactory.BindedProducts.Truck;

public class AmericanTruck implements Truck {
    @Override
    public void ridingTruck() {
        System.out.println("I am riding American Truck");
    }

    @Override
    public void pullingTrailler() {
        System.out.println("I am riding American Truck with trailler");
    }
}
