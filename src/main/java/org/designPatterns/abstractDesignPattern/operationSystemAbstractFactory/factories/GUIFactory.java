package main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.factories;

import main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.buttons.Button;
import main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.checkBoxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
