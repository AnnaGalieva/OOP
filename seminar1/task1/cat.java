public class cat {

    private String color;
    private int weight;
    private int age;
    private String name;

    public cat(String color, int weight, int age, String name) {
        this.color = color;
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void sayMyaou() {
        System.out.println("Myaou!!!");
    }
}

