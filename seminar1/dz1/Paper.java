package OOP.seminar1.dz1;

public class Paper extends Hygiene {
    private int numberOfLayers;     //кол-во слоев

    protected String getInfo() {
        return String.format("%s \nКоличество слоев: %d", super.getInfo(), numberOfLayers);
    }

    public void setInfo(String name, int price, int amount, String unit, int numberOfPieces, int layers) {
        super.setInfo(name, price, amount, unit, numberOfPieces);
        this.numberOfLayers = layers;
    }
}