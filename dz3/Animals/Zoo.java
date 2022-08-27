package Animals;
import java.util.List;


public class Zoo {
    

    public void addAnimal(Animal animal, List<Animal> animalList1){
        animalList1.add(animal);
    }

    public void delAnimal(int number, List<Animal> animalList1){
        animalList1.remove(number);
    }

    public void infoAnimal(int number, List<Animal> animalList1){
        animalList1.get(number).getClass().getSimpleName();
        System.out.println(animalList1.get(number).printInfo());
    }

    public void sound(int number, List<Animal> animalList1){
        animalList1.get(number).MakeSound();
    }


    public void allInfoAnimal(List<Animal> animalList1){
        for (int i = 0; i < animalList1.size(); i++) {
            System.out.println(animalList1.get(i).printInfo());
        }

    }

    public void allSound(List<Animal> animalList1){
        for (int i = 0; i < animalList1.size(); i++) {
            animalList1.get(i).MakeSound();
        }
    }
}
