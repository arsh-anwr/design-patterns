package org.designPatterns.abstractFactory.operationSystemAbstractFactory.buttons;

public class MacOsButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOsButton.");
    }
}
