public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.5);
        System.out.println("Circle 1 area: " + circle1.getArea());
        System.out.println("Circle 2 area: " + circle2.getArea());
    }
}
