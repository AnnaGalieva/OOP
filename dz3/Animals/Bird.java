package Animals;

public abstract class Bird extends Animal{

    int heightOfFlight;

    public Bird(int height, int weight, String eyesColor, int heightOfFlight){
        super(height, weight, eyesColor);
        this.heightOfFlight = heightOfFlight;
    }

    @Override
    public abstract void MakeSound();

    public void Fly(){
        System.out.println("Я лечу на высоте" + this.heightOfFlight);
    }

    public String printInfo(){
        return String.format("%s\nheight of fly: %d", super.printInfo(), this.heightOfFlight);
    }

}
