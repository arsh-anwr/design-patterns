package main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.factories;

import main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.buttons.Button;
import main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.buttons.WindowsOsButton;
import main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.checkBoxes.Checkbox;
import main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.checkBoxes.WindowsOsCheckBox;

public class WindowsOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsOsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsOsCheckBox();
    }
}
