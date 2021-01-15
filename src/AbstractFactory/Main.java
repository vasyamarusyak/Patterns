package AbstractFactory;

import AbstractFactory.AbstractFactoryForCertainProduct.AmericanFactory;
import AbstractFactory.AbstractFactoryForCertainProduct.EuropeanFactory;

public class Main {
    public CreateCertainFamily createCertainFamily;

    public void createFamily() {
        AbstractFactory carFactory = new AmericanFactory();
        AbstractFactory carFactory2 = new EuropeanFactory();

        createCertainFamily = new CreateCertainFamily(carFactory);
        createCertainFamily = new CreateCertainFamily(carFactory2);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.createFamily();

    }
}
