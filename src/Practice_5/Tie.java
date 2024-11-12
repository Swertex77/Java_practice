package Practice_5;

public class Tie extends Clothes implements MenClothing {

    public Tie(double price, String size, String color) {
        super(price, size, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает галстук: " + this);
    }
}
