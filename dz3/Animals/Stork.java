package Animals;

public class Stork extends Bird {
    public Stork(int height, int weight, String eyesColor, int heightOfFlight) {
        super(height, weight, eyesColor, heightOfFlight);
    }

    @Override
    public void MakeSound() {
        System.out.println("АААААА");
    }
}
