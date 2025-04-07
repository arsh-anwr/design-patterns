package org.designPatterns.singleton;

public class LazyInitSingleton {
    private static LazyInitSingleton instance;

    private LazyInitSingleton() {
        System.out.println("Lazy init singleton - Not thread safe");
    }

    public static LazyInitSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitSingleton();
        }
        return instance;
    }
}
