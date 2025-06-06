abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    private double radius;
    Circle(double radius) {
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
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }
}
class Main {
    public static void main(String[] args) {
        Shape shape;
        shape = new Circle(5);
        System.out.println("Circle area: " + shape.area());
        shape = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + shape.area());
    }
}
