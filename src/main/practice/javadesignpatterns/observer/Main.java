package javadesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;

// Subject interface
interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

// Observer interface
interface Observer {
    void update(String message);
}

// Concrete Subject class implementing Subject interface
class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Method to update the state and notify observers
    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}

// Concrete Observer class implementing Observer interface
class ConcreteObserver implements Observer {
    private String observerName;

    public ConcreteObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(String message) {
        System.out.println(observerName + " received the message: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a concrete subject
        ConcreteSubject subject = new ConcreteSubject();

        // Create concrete observers
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

        // Register observers to the subject
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        // Set a message in the subject; observers will be notified
        subject.setMessage("Hello, observers!");

        // Output:
        // Observer 1 received the message: Hello, observers!
        // Observer 2 received the message: Hello, observers!
    }
}
