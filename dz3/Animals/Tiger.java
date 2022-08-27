package Animals;

public class Tiger extends WildAnimal{
    
    public Tiger (int height, int weight, String eyesColor, String color, String dateOfBirth, 
    Boolean vaccinated, String name, String breed, String lifeArea, String dateOfFound){
        super(height, weight, eyesColor, color, dateOfBirth, vaccinated, name, breed, lifeArea, dateOfFound);
    }

    @Override
    public void MakeSound(){
        System.out.println("РРР");
    }
}
