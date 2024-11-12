package Practice_10;

public class TestGeometricObject_ex1 {
    public static void main(String[] args) {
        // Создаем два круга для сравнения
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.0);

        // Используем метод max() для нахождения наибольшего круга
        GeometricObject largestCircle = GeometricObject.max(circle1, circle2);
        System.out.println("Наибольший круг: " + largestCircle);

        // Создаем два прямоугольника для сравнения
        Rectangle rectangle1 = new Rectangle(4.0, 5.0);
        Rectangle rectangle2 = new Rectangle(3.0, 8.0);

        // Используем метод max() для нахождения наибольшего прямоугольника
        GeometricObject largestRectangle = GeometricObject.max(rectangle1, rectangle2);
        System.out.println("Наибольший прямоугольник: " + largestRectangle);
    }
}
