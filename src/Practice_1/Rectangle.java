package Practice_1;

public class Rectangle {

    double width = 1;
    double height = 1;

    // Конструктор без аргументов
    Rectangle() {}

    // Конструктор с параметрами для ширины и высоты
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    // Метод для получения площади
    double getArea() {
        return width * height;
    }

    // Метод для получения периметра
    double getPerimeter() {
        return 2 * (width + height);
    }
}

class TestRectangle {
    public static void main(String[] args) {

        // Создание двух объектов Rectangle
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        // Вывод информации о первом прямоугольнике
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.width);
        System.out.println("Height: " + rectangle1.height);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        // Вывод информации о втором прямоугольнике
        System.out.println("Rectangle 2:");
        System.out.println("Width: " + rectangle2.width);
        System.out.println("Height: " + rectangle2.height);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }

}
