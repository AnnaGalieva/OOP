public class program {
    public static void main(String[] args) {
        cat cat = new cat("Black", 3, 5, "Barsik");

        System.out.println("cat name: " + cat.getName() + "\ncat color: " + cat.getColor() +
                "\ncat age:  " + cat.getAge() + "\ncat weight: " + cat.getWeWeight());
                cat.sayMyaou();
    }
}
