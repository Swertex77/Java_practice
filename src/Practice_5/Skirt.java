package Practice_5;

public class Skirt extends Clothes implements WomenClothing {

    public Skirt(double price, String size, String color) {
        super(price, size, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надевает юбку: " + this);
    }
}