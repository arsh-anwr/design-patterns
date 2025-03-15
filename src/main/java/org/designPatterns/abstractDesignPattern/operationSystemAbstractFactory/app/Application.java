package main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.app;

import main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.buttons.Button;
import main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.checkBoxes.Checkbox;
import main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.factories.GUIFactory;

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
