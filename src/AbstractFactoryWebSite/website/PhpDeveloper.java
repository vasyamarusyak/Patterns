package AbstractFactoryWebSite.website;

import AbstractFactoryWebSite.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes Php code...");
    }
}

