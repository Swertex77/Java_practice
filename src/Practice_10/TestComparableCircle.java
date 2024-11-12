package Practice_10;

public class TestComparableCircle {
    public static void main(String[] args) {
        // Создаем два экземпляра ComparableCircle
        ComparableCircle comparableCircle1 = new ComparableCircle(5.0);
        ComparableCircle comparableCircle2 = new ComparableCircle(7.0);

        // Используем метод max() для нахождения наибольшего круга
        GeometricObject largestComparableCircle = GeometricObject.max(comparableCircle1, comparableCircle2);
        System.out.println("Наибольший из двух кругов tasks_1_to_3.ComparableCircle: " + largestComparableCircle);

        // Создаем круг и прямоугольник для сравнения
        ComparableCircle circle = new ComparableCircle(6.0);
        Rectangle rectangle = new Rectangle(4.0, 5.0);

        // Используем метод max() для нахождения наибольшего объекта между кругом и прямоугольником
        GeometricObject largestShape = GeometricObject.max(circle, rectangle);
        System.out.println("Наибольший объект между кругом и прямоугольником: " + largestShape);
    }
}