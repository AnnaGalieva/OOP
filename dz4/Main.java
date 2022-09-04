package OOP.dz4;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Link low = new Link();
        low.addLink(1, new Date(), "01.02.2023", "Alex", Priority.Low);
        low.addLink(2, new Date(), "21.09.2024", "Dima", Priority.Low);
        System.out.println(low.toString());
    }
}
