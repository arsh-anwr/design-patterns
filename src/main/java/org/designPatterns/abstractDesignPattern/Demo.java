package main.java.org.designPatterns.abstractDesignPattern;

import main.java.org.designPatterns.abstractDesignPattern.app.Application;
import main.java.org.designPatterns.abstractDesignPattern.factories.GUIFactory;
import main.java.org.designPatterns.abstractDesignPattern.factories.MacOsFactory;
import main.java.org.designPatterns.abstractDesignPattern.factories.WindowsOsFactory;

public class Demo {
    private static Application configureApp() {
        Application application;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            factory = new WindowsOsFactory();
        }

        application = new Application(factory);

        return application;
    }

    public static void main(String[] args) {
        Application app = configureApp();
        app.paint();
    }
}
