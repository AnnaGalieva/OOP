package OOP.seminar1.dz1;

public class Drinks extends Products {
    private Double volume;     //объем

    protected String getInfo() {
        return String.format("%s \nОбъём: %s", super.getInfo(), volume);
    }

    public void setInfo(String name, int price, int amount, String unit, Double volume) {
        super.setInfo(name, price, amount, unit);
        this.volume = volume;
    }
}