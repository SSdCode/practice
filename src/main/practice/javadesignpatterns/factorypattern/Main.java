package javadesignpatterns.factorypattern;

// Factory class to create different types of shapes
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw(); // Output: Inside Circle::draw() method.

        // Get an object of Rectangle and call its draw method
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw(); // Output: Inside Rectangle::draw() method.
    }
}

