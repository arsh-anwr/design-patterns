package main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.factories;

import main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.buttons.Button;
import main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.buttons.MacOsButton;
import main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.checkBoxes.Checkbox;
import main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.checkBoxes.MacOsCheckBox;

public class MacOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacOsCheckBox();
    }
}
