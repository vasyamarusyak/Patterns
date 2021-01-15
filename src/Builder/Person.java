package Builder;

public class Person {
    //Обовязкові поля
    private String name;
    private String surname;
    //Необовязкові поля
    private int age;
    private int height;
    private int weight;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }


    public static class Builder {
        private String name;
        private String surname;

        private Person newPerson = new Person();

        public Builder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Builder setAge(int age){
            newPerson.age = age;
            return this;
        }

        public Builder setHeight(int height){
            newPerson.height = height;
            return this;
        }

        public Builder setWeight(int weight){
            newPerson.weight = weight;
            return this;
        }

        public Person build(){
            return newPerson;
        }

    }

}
