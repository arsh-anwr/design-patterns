package main.java.org.designPatterns.abstractDesignPattern.factories;

import main.java.org.designPatterns.abstractDesignPattern.buttons.Button;
import main.java.org.designPatterns.abstractDesignPattern.buttons.WindowsOsButton;
import main.java.org.designPatterns.abstractDesignPattern.checkBoxes.Checkbox;
import main.java.org.designPatterns.abstractDesignPattern.checkBoxes.WindowsOsCheckBox;

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
