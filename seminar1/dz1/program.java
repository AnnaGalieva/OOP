package OOP.seminar1.dz1;

import java.time.LocalDate;

public class program {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();

        Milk milk = new Milk();
        milk.setInfo("молоко ", 100, 2, "l", 1.5,
                3.2, nowDate.plusDays(5).toString());
        System.out.println(milk.toString());

        System.out.println("------------------");

        Lemonade lemonade = new Lemonade();
        lemonade.setInfo("сок", 50, 1, "l", 1.5);
        System.out.println(lemonade.toString());

        System.out.println("------------------");

        Bread bread = new Bread();
        bread.setInfo("белый", 55, 1, "p",
                nowDate.plusDays(3).toString(), "ржаная");
        System.out.println(bread.toString());

        System.out.println("------------------");

        Eggs eggs = new Eggs();
        eggs.setInfo("яйца", 100, 1, "pcs",
                nowDate.plusDays(15).toString(), 10);
        System.out.println(eggs.toString());

        System.out.println("------------------");

        Mask mask = new Mask();
        mask.setInfo("медицинские маски", 100, 1, "pcs", 100);
        System.out.println(mask.toString());

        System.out.println("------------------");

        Paper paper = new Paper();
        paper.setInfo("familiya", 350, 1, "pcs", 12, 3);
        System.out.println(paper.toString());

        System.out.println("------------------");

        Diapers diapers = new Diapers();
        diapers.setInfo("merries", 1400, 1, "pcs", 1, true, "xxs",
                1.2, 4.5, "универсальные");
        System.out.println(diapers.toString());

        System.out.println("------------------");

        Pacifier pacifier = new Pacifier();
        pacifier.setInfo("солнышко", 190, 1, "pcs", 2, true);
        System.out.println(pacifier.toString());

    }
}