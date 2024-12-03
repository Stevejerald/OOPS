// Abstract class for Shape
abstract class Shape {
    String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method (must be implemented by subclasses)
    abstract double calculateArea();

    // Concrete method
    public void displayColor() {
        System.out.println("Shape Color: " + color);
    }
}

// Subclass for Circle
class Circle extends Shape {
    double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementing abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    double length, width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Main class
public class AbstractExample {
    public static void main(String[] args) {
        // Create objects of Circle and Rectangle
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Display colors and calculate areas
        circle.displayColor();
        System.out.println("Circle Area: " + circle.calculateArea());

        rectangle.displayColor();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
