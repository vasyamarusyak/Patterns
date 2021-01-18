package Singelton;

import java.util.Objects;

class Car {
    public String name = "Mazda";
    public int age = 100;

    private static Car car = new Car();

    private Car() {
    }

    public static Car getObject() {
        return car;
    }

    public void run() {
        System.out.println("Car is running");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 1;
        if(name == null){
            result = prime * result;
        }else result = prime * result + name.hashCode();
        //result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result +
                ((name == null) ? 0 : name.hashCode());
        return result;
    }


}

