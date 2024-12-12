package Practice_15;

public class CircleUtil {

    // Метод для поиска наибольшего круга в массиве
    public static Circle findLargestCircle(Circle[] circles) {
        if (circles == null || circles.length == 0) {
            return null; // Возврат null, если массив пуст или не инициализирован
        }

        Circle largest = circles[0]; // Предположим, что первый круг - наибольший

        for (int i = 1; i < circles.length; i++) {
            if (circles[i].compareTo(largest) > 0) { // Сравнение текущего круга с наибольшим
                largest = circles[i]; // Обновление наибольшего круга
            }
        }

        return largest; // Возврат наибольшего круга
    }

    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(2.5),
                new Circle(3.0),
                new Circle(1.5),
                new Circle(4.0),
                new Circle(3.5)
        };

        Circle largestCircle = findLargestCircle(circles);

        if (largestCircle != null) {
            System.out.println("Наибольший круг: " + largestCircle);
        } else {
            System.out.println("Массив кругов пуст.");
        }
    }
}