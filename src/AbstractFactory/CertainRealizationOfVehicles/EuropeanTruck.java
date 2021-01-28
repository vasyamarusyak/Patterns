package AbstractFactory.CertainRealizationOfVehicles;

import AbstractFactory.BindedProducts.Truck;

public class EuropeanTruck implements Truck {
    @Override
    public void ridingTruck() {
        System.out.println("I am riding European Truck without trailler");
    }

    @Override
    public void pullingTrailler() {
        System.out.println("I am riding European Truck with trailler");
    }
}
