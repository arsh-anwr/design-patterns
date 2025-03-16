package org.designPatterns.abstractFactory.operationSystemAbstractFactory.factories;


import org.designPatterns.abstractFactory.operationSystemAbstractFactory.buttons.Button;
import org.designPatterns.abstractFactory.operationSystemAbstractFactory.checkBoxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
