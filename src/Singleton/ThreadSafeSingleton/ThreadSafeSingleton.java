package Singleton.ThreadSafeSingleton;

import Singleton.StaticBlockInitialization.StaticBlockSingleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();

        System.out.println("staticBlockSingleton1 object hashcode: " + threadSafeSingleton1.hashCode());
        System.out.println("staticBlockSingleton2 object hashcode: " + threadSafeSingleton2.hashCode());
    }
}
