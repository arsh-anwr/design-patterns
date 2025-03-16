package org.designPatterns.abstractFactory.operationSystemAbstractFactory.factories;

import org.designPatterns.abstractFactory.operationSystemAbstractFactory.buttons.Button;
import org.designPatterns.abstractFactory.operationSystemAbstractFactory.buttons.MacOsButton;
import org.designPatterns.abstractFactory.operationSystemAbstractFactory.checkBoxes.Checkbox;
import org.designPatterns.abstractFactory.operationSystemAbstractFactory.checkBoxes.MacOsCheckBox;

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
