package OOP.seminar1.dz1;

public class Bread extends Foods {
    private String typeOfFlour;    //тип муки

    protected String getInfo() {
        return String.format("%s \nТип муки: %s", super.getInfo(), typeOfFlour);
    }

    public void setInfo(String name, int price, int amount, String unit, String best, String type) {
        super.setInfo(name, price, amount, unit, best);
        this.typeOfFlour = type;
    }
}