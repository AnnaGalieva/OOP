package OOP.seminar1.dz1;

public class Eggs extends Foods {
    private int numberOfPieces;   //кол-во в упаковке

    protected String getInfo() {
        return String.format("%s \nКоличество яиц: %d", super.getInfo(), numberOfPieces);
    }

    public void setInfo(String name, int price, int amount, String unit, String best, int numb) {
        super.setInfo(name, price, amount, unit, best);
        this.numberOfPieces = numb;
    }
}