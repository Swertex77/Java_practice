package Practice_11;

import Practice_10.GeometricObject;

public class TestSumArea {
    public static void main(String[] args) {
        // Создаем массив из четырех геометрических объектов
        GeometricObject[] shapes = new GeometricObject[4];

        // Добавляем два круга и два прямоугольника
        shapes[0] = new Circle(5); // Первый круг с радиусом 5
        shapes[1] = new Circle(3); // Второй круг с радиусом 3
        shapes[2] = new Rectangle(4, 5); // Первый прямоугольник (ширина 4, высота 5)
        shapes[3] = new Rectangle(6, 2); // Второй прямоугольник (ширина 6, высота 2)

        // Вычисляем общую площадь
        double totalArea = sumArea(shapes);

        // Отображаем результат
        System.out.printf("Общая площадь всех геометрических объектов: %.2f%n", totalArea);
    }

    public static double sumArea(GeometricObject[] a) {
        double totalArea = 0;
        for (GeometricObject obj : a) {
            totalArea += obj.getArea(); // Суммируем площади
        }
        return totalArea;
    }
}
