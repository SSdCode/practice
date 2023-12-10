package javadesignpatterns.factorypattern;

// Factory class to create different types of shapes
public class ShapeFactory {
    // Method to get a Shape object based on the shape type provided
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        return null;
    }
}
