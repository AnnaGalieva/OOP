package OOP.seminar1.dz1;

public class Diapers extends Children {
    private String size;          //размер
    private Double minWeight;     //мин вес 
    private Double maxWeight;     //макс вес
    private String type;          //тип

    protected String getInfo() {
        return String.format("%s \nРазмер: %s \nМинимальный вес: %.1f \nМаксимальный вес: %.1f \nТип: %s",
                super.getInfo(), size, minWeight, maxWeight, type);
    }

    public void setInfo(String name, int price, int amount, String unit, int minAge, Boolean hypo,
            String size, Double min, Double max, String type) {
        super.setInfo(name, price, amount, unit, minAge, hypo);
        this.size = size;
        this.minWeight = min;
        this.maxWeight = max;
        this.type = type;
    }
}