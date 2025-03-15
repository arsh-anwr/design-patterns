package main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.factories;

import main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.buttons.Button;
import main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.checkBoxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
