package org.designPatterns.singleton;

public class LazyInitThreadSafeSingleton {
    private static LazyInitThreadSafeSingleton instance;

    private LazyInitThreadSafeSingleton() {
        System.out.println("Lazy init singleton - thread safe");
    }

    // Synchronized method ensures only one thread can execute this at a time.
    public static synchronized LazyInitThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitThreadSafeSingleton();
        }
        return instance;
    }
}
