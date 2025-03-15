package main.java.org.designPatterns.abstractDesignPattern.factories;

import main.java.org.designPatterns.abstractDesignPattern.buttons.Button;
import main.java.org.designPatterns.abstractDesignPattern.buttons.MacOsButton;
import main.java.org.designPatterns.abstractDesignPattern.checkBoxes.Checkbox;
import main.java.org.designPatterns.abstractDesignPattern.checkBoxes.MacOsCheckBox;

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
