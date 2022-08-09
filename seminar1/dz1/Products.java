package OOP.seminar1.dz1;

public class Products {
    private String name;  //название
    private int price;    //цена
    private int amount;   //кол-во
    private String unit;  //ед.измерения

    protected String getInfo() {
        return String.format("Название: %s \nЦена: %d \nКоличество: %d %s", name, price, amount, unit);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public void setInfo(String name, int price, int amount, String unit) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
    }
}