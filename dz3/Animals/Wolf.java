package Animals;

public class Wolf extends WildAnimal {

    private String pack_leader;

    public Wolf (int height, int weight, String eyesColor, String color, String dateOfBirth, 
    Boolean vaccinated, String name, String breed, String lifeArea, String dateOfFound, String pack_leader) {
        
        super(height, weight, eyesColor, color, dateOfBirth, vaccinated, name, breed, lifeArea, dateOfFound);
        this.pack_leader = pack_leader;
    }

    @Override
    public void MakeSound() {
        System.out.println("RRR");
    }

    @Override
    public String printInfo(){
        return String.format("%s, %s", super.printInfo(), this.pack_leader);
    }
}
