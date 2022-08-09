package OOP.dz2;

public class program {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 8);
        System.out.println("Периметр прямоугольника длиной 3 и шириной 8 составляет:" + rectangle.getGirth());
        System.out.println("Площадь прямоугольника длиной 3 и шириной 8 составляет:" + rectangle.getArea());

        Circle circle = new Circle(9);
        System.out.println("\nПериметр круга радиусом 9 равен:" + circle.getCircumference());
        System.out.println("Площадь круга радиусом 9 равна:" + circle.getArea());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("\nПериметр треугольника со сторонами 3, 4, 5 равен:" + triangle.getGirth());
        System.out.println("Площадь треугольника со сторонами 3, 4 и 5 равна:" + triangle.getArea());

        Square square = new Square(4);
        System.out.println("\nПериметр квадрата со стороной 4 равен:" + square.getGirth());
        System.out.println("Площадь квадрата со стороной 4  равна:" + square.getArea());
    }

}
