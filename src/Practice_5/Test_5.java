package Practice_5;

public class Test_5 {
    public static void main(String[] args) {
        TShirt menTShirt = new TShirt(1200.50, "M", "Синий");
        TShirt womenTShirt = new TShirt( 1100.75,"S", "Красный");

        menTShirt.dressMan();
        womenTShirt.dressWomen();
    }
}
