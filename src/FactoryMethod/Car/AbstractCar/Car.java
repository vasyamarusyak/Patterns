package FactoryMethod.Car.AbstractCar;

public abstract class Car {
    public String carName;

    public void makeWheels(){
        System.out.println("Wheels for car " + carName + " are created");
    }
    public void makeCarsBody(){
        System.out.println("Car body for car " + carName + " is created");
    }

    public void release(){
        System.out.println("Your car is ready!!!!!!");
        System.out.println();
    }
}
