package Animals;

public abstract class Animal {
    int height;
    int weight;
    String eyesColor;
    

    public Animal(int height, int weight, String eyesColor){
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
    
    }


    public abstract void MakeSound();

    public String printInfo(){
        return String.format("%d: height, %d: weight, %s: eyesColor", height, weight, eyesColor);
    }
}

