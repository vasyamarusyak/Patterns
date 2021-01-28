package AbstractFactory.CertainRealizationOfVehicles;

import AbstractFactory.BindedProducts.Bike;

public class EuropeanBike implements Bike {
    @Override
    public void ridingBike() {
        System.out.println("---- I ride European Style Bike!!!!!");
    }
}
