package main.java.org.designPatterns.abstractDesignPattern.operationSystemAbstractFactory.checkBoxes;

public class MacOsCheckBox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created MacOsCheckbox");
    }
}
