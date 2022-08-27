package Animals;

public class Chicken extends Bird{
    
    public Chicken (int height, int weight, String eyesColor, int heightOfFlight) {
        super (height, weight, eyesColor, heightOfFlight);
    }
    
    @Override
    public void MakeSound() {
        System.out.println("кудах-тах-тах");
    }

    @Override
    public void Fly() {
        System.out.println(String.format("%s %d", "я лечу на высоте",this.heightOfFlight));
    }
}
