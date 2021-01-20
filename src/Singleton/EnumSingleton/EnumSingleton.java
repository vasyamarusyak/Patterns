package Singleton.EnumSingleton;

public enum EnumSingleton {

    INSTANCE;

    /*
    Enum constructors are private by default.
     Only private constructors are allowed in enum types.
     That’s why you can’t instantiate enum types using a new operator.
     */
    //Тут повинен був бути конструктор

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();


        System.out.println("staticBlockSingleton1 object hashcode: " + enumSingleton1.hashCode());
        System.out.println("staticBlockSingleton2 object hashcode: " + enumSingleton2.hashCode());
    }
}
