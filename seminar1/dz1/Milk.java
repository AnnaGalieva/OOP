package OOP.seminar1.dz1;

public class Milk extends Drinks {
    private Double fat;              //жирность
    private String bestBeforeDate;   //срок годности 

    protected String getInfo() {
        return String.format("%s \nЖирность: %.1f \nСрок годности: %s",
                super.getInfo(), fat, bestBeforeDate);
    }

    public void setInfo(String name, int price, int amount, String unit, Double volume, Double fat, String best) {
        super.setInfo(name, price, amount, unit, volume);
        this.fat = fat;
        this.bestBeforeDate = best;
    }
}