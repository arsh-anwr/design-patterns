package main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.app;

import main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.buttons.Button;
import main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.checkBoxes.Checkbox;
import main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.factories.GUIFactory;

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
