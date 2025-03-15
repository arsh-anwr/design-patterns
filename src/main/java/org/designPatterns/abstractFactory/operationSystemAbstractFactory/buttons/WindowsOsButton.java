package main.java.org.designPatterns.abstractFactory.operationSystemAbstractFactory.buttons;

public class WindowsOsButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have create WindowsOsButton");
    }
}
