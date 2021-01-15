package Singelton;

public class Main {

    public static void main(String[] args) {

        Car c1 = Car.getObject();
        c1.run();

        Car c2 = Car.getObject();
        c2.run();

        Car c3 = Car.getObject();
        c3.run();

        System.out.println("Car c1 object hashcode: " + c1);
        System.out.println("Car c2 object hashcode: " + c2);
        System.out.println("Car c3 object hashcode: " + c3);

    }
}
