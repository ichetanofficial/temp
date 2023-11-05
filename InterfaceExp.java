interface Shape1 {
    double calculateArea();
    double calculatePerimeter();
}
class Circle1 implements Shape1 {
    private double radius;
    public Circle1(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle1 implements Shape1 {
    private double length;
    private double width;
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class InterfaceExp {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(5.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        Rectangle1 rectangle = new Rectangle1(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}