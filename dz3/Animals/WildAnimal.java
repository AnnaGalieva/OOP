package Animals;

public abstract class WildAnimal extends Animal{

    protected String lifeArea;
    private String dateOfFound;


public WildAnimal (int height, int weight, String eyesColor, String color, String dateOfBirth, 
Boolean vaccinated, String name, String breed, String lifeArea, String dateOfFound) {
    super(height, weight, eyesColor);
    this.lifeArea = lifeArea;
    this.dateOfFound = dateOfFound;
}



@Override
public abstract void MakeSound();

@Override
public String printInfo (){
    return String.format ("%s, %s, %s", super.printInfo(), this.lifeArea, this.dateOfFound);

}
}
