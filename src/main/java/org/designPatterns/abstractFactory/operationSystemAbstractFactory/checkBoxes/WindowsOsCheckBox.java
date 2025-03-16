package org.designPatterns.abstractFactory.operationSystemAbstractFactory.checkBoxes;

public class WindowsOsCheckBox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created WindowsOsCheckbox");
    }
}
