package main.java.org.designPatterns.abstractDesignPattern.factories;

import main.java.org.designPatterns.abstractDesignPattern.buttons.Button;
import main.java.org.designPatterns.abstractDesignPattern.checkBoxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
