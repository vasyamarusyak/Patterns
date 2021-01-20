package Singleton.BillPughSingleton;

import Singleton.ThreadSafeSingleton.ThreadSafeSingleton;

public class BillPughSingleton {
    static String name;

    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(String name){
        BillPughSingleton.name = name;
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance("Name");
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance("sdfugsdfsdfgds");

        System.out.println("staticBlockSingleton1 object hashcode: " + billPughSingleton1.hashCode());
        System.out.println("staticBlockSingleton2 object hashcode: " + billPughSingleton2.hashCode());
    }
}
