package OOP.seminar1.dz1;

public class Foods extends Products {
    private String bestBeforeDate;   //срок годности

    protected String getInfo() {
        return String.format("%s \nСрок годности: %s", super.getInfo(), bestBeforeDate);
    }

    public void setInfo(String name, int price, int amount, String unit, String best) {
        super.setInfo(name, price, amount, unit);
        this.bestBeforeDate = best;
    }
}