package Practice_5;

public class Pants extends Clothes implements MenClothing, WomenClothing {

    public Pants(double price, String size, String color) {
        super(price, size, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает штаны: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надевает штаны: " + this);
    }
}
