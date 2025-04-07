package org.designPatterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
        System.out.println("BillPughSingleton instance created.");
    }

    // Inner static helper class - not loaded until getInstance() is called
    private static class BillPughInit {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        // The INSTANCE is created only when SingletonHelper class is loaded.
        // Class loading is guaranteed to be serial (thread-safe) by the JVM.
        return BillPughInit.INSTANCE;
    }
}
