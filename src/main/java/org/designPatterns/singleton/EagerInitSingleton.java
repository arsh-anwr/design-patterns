package org.designPatterns.singleton;

public class EagerInitSingleton {
    private static final EagerInitSingleton instance = new EagerInitSingleton();

    private EagerInitSingleton() {
        System.out.println("Single class created with eager initialization - ThreadSafe");
    }

    public static EagerInitSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Eager Initialized Singleton! HashCode: " + this.hashCode());
    }

    public static void main(String[] args) {
        EagerInitSingleton s1 = EagerInitSingleton.getInstance();
        EagerInitSingleton s2 = EagerInitSingleton.getInstance();

        s1.showMessage();
        s2.showMessage();

        if (s1 == s2) {
            System.out.println("Both s1 and s2 point to the same instance.");
        } else {
            System.out.println("Oops! Different instances were created."); // This won't happen
        }
    }
}
