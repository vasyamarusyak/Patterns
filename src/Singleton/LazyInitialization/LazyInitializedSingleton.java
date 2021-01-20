package Singleton.LazyInitialization;

public class LazyInitializedSingleton {
    static String name;

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(String name){
        LazyInitializedSingleton.name = name;

        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}