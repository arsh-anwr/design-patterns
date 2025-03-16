package org.designPatterns.abstractFactory.operationSystemAbstractFactory;


import org.designPatterns.abstractFactory.operationSystemAbstractFactory.app.Application;
import org.designPatterns.abstractFactory.operationSystemAbstractFactory.factories.GUIFactory;
import org.designPatterns.abstractFactory.operationSystemAbstractFactory.factories.MacOsFactory;
import org.designPatterns.abstractFactory.operationSystemAbstractFactory.factories.WindowsOsFactory;

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
