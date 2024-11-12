package Practice_5;

public class TShirt extends Clothes implements MenClothing, WomenClothing {

    public TShirt(double price, String size, String color) {
        super(price, size, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает футболку: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надевает футболку: " + this);
    }
}
