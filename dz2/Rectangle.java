package OOP.dz2;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getCircumference() {
        return 0;
    }

    public double getArea() {
        return a * b;
    }

    public double getGirth() {
        return 2 * (a + b);
    }

}
