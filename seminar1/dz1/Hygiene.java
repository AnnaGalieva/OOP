package OOP.seminar1.dz1;

public class Hygiene extends Products {
    private int numberOfPieces;      //кол-во в упаковке

    protected String getInfo() {
        return String.format("%s \nКоличество единиц в упаковке: %d", super.getInfo(), numberOfPieces);
    }

    public void setInfo(String name, int price, int amount, String unit, int numberOfPieces) {
        super.setInfo(name, price, amount, unit);
        this.numberOfPieces = numberOfPieces;
    }
}