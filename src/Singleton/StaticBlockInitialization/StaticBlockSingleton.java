package Singleton.StaticBlockInitialization;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        StaticBlockSingleton staticBlockSingleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockSingleton2= StaticBlockSingleton.getInstance();

        System.out.println("staticBlockSingleton1 object hashcode: " + staticBlockSingleton1.hashCode());
        System.out.println("staticBlockSingleton2 object hashcode: " + staticBlockSingleton2.hashCode());
    }
}