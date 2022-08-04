package OOP.seminar1.task2;
import java.util.Random;
public class Transport {
    protected static Random r;
    private String color;
    private String model;
    private int wheelNumber;
    private int weight;
    private int speed;


    public Transport (String color, String model, int wheelNumber, int weight, int speed){
        this.color = color;
        this.model = model;
        this.wheelNumber = wheelNumber;
        this.weight = weight;
        this.speed = speed;
    }

    public void move (){

        System.out.printf("%s moving",this.getClass().getSimpleName());
        System.out.println();
    }

    public String getInfo(){
        return String.format("model: %s , color: %s , wheelNumber: %d , weight: %d , speed: %d , Type: %s",
                this.model, this.color, this.wheelNumber, this.weight, this.speed, this.getClass().getSimpleName());
    }


}
    