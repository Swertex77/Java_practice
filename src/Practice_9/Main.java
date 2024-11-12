package Practice_9;

public class Main {
    public static void main(String[] args) {
        // Создаем массив из 5 объектов Circle с случайными радиусами
        Circle[] circleArray = new Circle[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random() * 100);
        }

        // Находим круг с самой большой площадью
        Circle largestCircle = findLargestCircle(circleArray);
        System.out.println("Круг с самой большой площадью: Радиус = " + largestCircle.getRadius() +
                ", Площадь = " + largestCircle.getArea());
    }

    /** Находит круг с наибольшей площадью в массиве circleArray */
    public static Circle findLargestCircle(Circle[] circleArray) {
        Circle largest = circleArray[0];
        for (Circle circle : circleArray) {
            if (circle.getArea() > largest.getArea()) {
                largest = circle;
            }
        }
        return largest;
    }
}

