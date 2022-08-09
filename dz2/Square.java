package OOP.dz2;

public class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getCircumference() {
        return 0;
    }

    public double getArea() {
        return a * a;
    }

    public double getGirth() {
        return 4 * a;
    }

}
