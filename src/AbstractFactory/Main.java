package AbstractFactory;

import AbstractFactory.BindedProducts.Bike;
import AbstractFactory.BindedProducts.Car;
import AbstractFactory.BindedProducts.Truck;
import AbstractFactory.VehicleFactory.AbstractFactory;
import AbstractFactory.VehicleFactory.AmericanFactory;
import AbstractFactory.VehicleFactory.EuropeanFactory;
import AbstractFactoryWebSite.Developer;
import AbstractFactoryWebSite.banking.BankingTeamFactory;

import javax.sound.midi.Track;

public class Main {
    public static void main(String[] args) {
        AbstractFactory americanFactory = new AmericanFactory();
        AbstractFactory europeanFactory = new EuropeanFactory();
        System.out.println("----------- BIKES-----------");
        Bike bike = americanFactory.createBike();
        bike.ridingBike();
        bike = europeanFactory.createBike();
        bike.ridingBike();

        System.out.println("----------- CARS-----------");
        Car car = americanFactory.createCar();
        car.pullingCar();
        car = europeanFactory.createCar();
        car.pullingCar();

        System.out.println("-----------TRACK-----------");
        Truck truck = americanFactory.createTruck();
        truck.ridingTruck();
        truck.pullingTrailler();
        truck = europeanFactory.createTruck();
        truck.ridingTruck();
        truck.pullingTrailler();
    }
}
