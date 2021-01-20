package Singleton.EagerInitialization;

public class Main {
    public static void main(String[] args) {
        Car c1 = Car.getObject(100, "Mazda");
        Car c2 = Car.getObject(20234230, "Mazsdfgsdfda");
        Car c3 = Car.getObject(123423, "Mazdasdfgsd");
        System.out.println("Car c1 object equals c1 object: " + c1.equals(c1));
        System.out.println("Car c1 object equals c2 object: " + c1.equals(c2));
        System.out.println("Car c1 object equals c3 object: " + c1.equals(c3));
        System.out.println("Car c2 object equals c3 object: " + c2.equals(c3));


        System.out.println("Car c1 object hashcode: " + c1.hashCode());
        System.out.println("Car c2 object hashcode: " + c2.hashCode());
        System.out.println("Car c3 object hashcode: " + c3.hashCode());

    }
}
