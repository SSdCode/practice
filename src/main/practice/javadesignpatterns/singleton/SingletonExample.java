package javadesignpatterns.singleton;

public class SingletonExample {
    // Private static variable to hold the single instance of the class
    private static SingletonExample instance;

    // Private constructor to prevent instantiation from other classes
    private SingletonExample() {
        // Constructor code goes here
    }

    // Public static method to provide the global access point to the Singleton instance
    public static SingletonExample getInstance() {
        // Check if the instance is null, create it if it doesn't exist
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    // Other methods and attributes can be added here
}

class Main {
    public static void main(String[] args) {
        // Getting the Singleton instance
        SingletonExample singletonInstance1 = SingletonExample.getInstance();
        SingletonExample singletonInstance2 = SingletonExample.getInstance();

        // Both instances should refer to the same object
        System.out.println(singletonInstance1 == singletonInstance2); // Output: true
    }
}

