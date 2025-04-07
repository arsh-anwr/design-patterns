package org.designPatterns.singleton;

public class DoubleCheckingLockSingleton {
    private static volatile DoubleCheckingLockSingleton instance;

    private DoubleCheckingLockSingleton() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Caught exception while thread execution.");
        }
        System.out.println("Double check init singleton - thread safe, only locks once while instance is being created, we need to use violatile as it can happen we try give access to incomplete initiated object.");
    }

    // Synchronized method ensures only one thread can execute this at a time.
    public static DoubleCheckingLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckingLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckingLockSingleton();
                }
            }
        }
        return instance;
    }
}
