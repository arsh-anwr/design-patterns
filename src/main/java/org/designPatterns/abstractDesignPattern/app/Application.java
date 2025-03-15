package main.java.org.designPatterns.abstractDesignPattern.app;

import main.java.org.designPatterns.abstractDesignPattern.buttons.Button;
import main.java.org.designPatterns.abstractDesignPattern.checkBoxes.Checkbox;
import main.java.org.designPatterns.abstractDesignPattern.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
