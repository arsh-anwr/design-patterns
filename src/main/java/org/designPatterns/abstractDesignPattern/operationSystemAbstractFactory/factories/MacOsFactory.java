package main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.factories;

import main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.buttons.Button;
import main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.buttons.MacOsButton;
import main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.checkBoxes.Checkbox;
import main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.checkBoxes.MacOsCheckBox;

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
