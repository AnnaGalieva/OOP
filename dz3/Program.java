import Animals.*;
import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {
        
        Cat cat = new Cat(1, 15, "green", "grey", "2012", false, "kot", "k");
        Dog dog = new Dog(2, 4, "red", "Boris", "Setter", false,
                "red", "11.11.11", true);

        List<Animal> animalList = new ArrayList<>();
        Zoo zoo = new Zoo();
        zoo.addAnimal(cat, animalList);
        zoo.infoAnimal(0, animalList);

        zoo.addAnimal(dog, animalList);
        zoo.infoAnimal(1, animalList);

        zoo.sound(0, animalList);
        zoo.sound(1, animalList);

        zoo.allInfoAnimal(animalList);
        zoo.allSound(animalList);

        
    }
}
