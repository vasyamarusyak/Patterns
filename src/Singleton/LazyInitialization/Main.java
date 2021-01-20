package Singleton.LazyInitialization;

public class Main {
    public static void main(String[] args) {
        LazyInitializedSingleton lazyInitializedSingleton1 = LazyInitializedSingleton.getInstance("Name");
        LazyInitializedSingleton lazyInitializedSingleton2 = LazyInitializedSingleton.getInstance("Name324rewg");

        System.out.println("staticBlockSingleton1 object hashcode: " + lazyInitializedSingleton1.hashCode());
        System.out.println("staticBlockSingleton2 object hashcode: " + lazyInitializedSingleton2.hashCode());
    }
}
