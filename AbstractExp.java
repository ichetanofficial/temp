abstract class Shape {
    abstract double area();
    void display() {
        System.out.println("Shape is an Abstract Class");
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
public class AbstractExp {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        circle.display();
        System.out.println("Area of Circle: " + circle.area());
        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}