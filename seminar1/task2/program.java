package OOP.seminar1.task2;

public class program {
    public static void main(String[] args) {
        Car car_1 = new Car("Black", "Kia Rio", 1200, 100);
        System.out.println(car_1.getInfo());
        car_1.move();

        Bycycle bike = new Bycycle("Green", "Bitwine", 20, 30);
        System.out.println(bike.getInfo());
        bike.move();

        Motocycle moto = new Motocycle("Red", "Suzuki", 200);
        System.out.println(moto.getInfo());
        moto.move();
    }
}
