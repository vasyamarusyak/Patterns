package AbstractFactoryWebSite.banking;

import AbstractFactoryWebSite.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
