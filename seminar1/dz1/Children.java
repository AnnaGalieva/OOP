package OOP.seminar1.dz1;

public class Children extends Products {
    private int minAge;                     //мин возраст
    private Boolean hypoallergenic;         //гипоаллергенность

    protected String getInfo() {
        return String.format("%s \nМинимальный возраст: %d \nГипоаллергенный: %s",
                super.getInfo(), minAge, hypoallergenic);
    }

    public void setInfo(String name, int price, int amount, String unit, int minAge, Boolean hypo) {
        super.setInfo(name, price, amount, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypo;
    }
}
