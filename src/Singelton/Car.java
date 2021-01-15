package Singelton;

class Car {
    private static Car car;

    private Car() {
    }

    public static Car getObject() {
        return car;
    }

    public void run() {
        System.out.println("Car is running");
    }
}

