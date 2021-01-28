package AbstractFactory.CertainRealizationOfVehicles;

import AbstractFactory.BindedProducts.Bike;

public class AmericanBike implements Bike {
    @Override
    public void ridingBike() {
        System.out.println("----I ride American Style Bike!!!!!!!!");
    }
}
