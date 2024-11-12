package Practice_5;

public abstract class Clothes {
    String size;
    double price;
    String color;

    public Clothes(double price, String size, String color) {
        this.price = price;
        this.size = size;
        this.color = color;
    }
}
