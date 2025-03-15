package main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.factories;

import main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.buttons.Button;
import main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.buttons.WindowsOsButton;
import main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.checkBoxes.Checkbox;
import main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.checkBoxes.WindowsOsCheckBox;

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
