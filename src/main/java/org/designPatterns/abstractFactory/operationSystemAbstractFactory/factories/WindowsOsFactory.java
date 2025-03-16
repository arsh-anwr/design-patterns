package org.designPatterns.abstractFactory.operationSystemAbstractFactory.factories;


import org.designPatterns.abstractFactory.operationSystemAbstractFactory.buttons.Button;
import org.designPatterns.abstractFactory.operationSystemAbstractFactory.buttons.WindowsOsButton;
import org.designPatterns.abstractFactory.operationSystemAbstractFactory.checkBoxes.Checkbox;
import org.designPatterns.abstractFactory.operationSystemAbstractFactory.checkBoxes.WindowsOsCheckBox;

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
