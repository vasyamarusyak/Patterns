package Builder;

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder("Vasya", "Pupkin")
                .setAge(32)
                .setHeight(165)
                .setWeight(70)
                .build();
        System.out.println(myPerson.getName());
        System.out.println(myPerson.getSurname());
        System.out.println(myPerson.getAge());
        System.out.println(myPerson.getHeight());
        System.out.println(myPerson.getWeight());
    }
}
