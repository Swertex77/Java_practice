package Practice_3;

public class Test_3 {
    public static void main(String[] args) {

        Circle c1 = new Circle("red", true, 1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Rectangle r1 = new Rectangle("blue", true, 1.2, 3.6);
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());


        Square s1 = new Square("yellow", true, 2.1, 4.7);
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getArea());
    }
}
