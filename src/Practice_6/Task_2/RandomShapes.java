package Practice_6.Task_2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomShapes extends JPanel {

    private List<Shape> shapes;

    public RandomShapes() {
        shapes = new ArrayList<>();
        generateRandomShapes();
    }

    private void generateRandomShapes() {
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(400);
            int y = random.nextInt(400);
            if (random.nextBoolean()) {
                // Создаем круг
                int radius = random.nextInt(30) + 10; // радиус от 10 до 40
                shapes.add(new Circle(color, x, y, radius));
            } else {
                // Создаем прямоугольник
                int width = random.nextInt(60) + 20; // ширина от 20 до 80
                int height = random.nextInt(60) + 20; // высота от 20 до 80
                shapes.add(new Rectangle(color, x, y, width, height));
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        RandomShapes panel = new RandomShapes();

        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
