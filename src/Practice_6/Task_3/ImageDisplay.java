package Practice_6.Task_3;

import javax.swing.*;

public class ImageDisplay extends JFrame {

    public ImageDisplay(String imagePath) {
        setTitle("Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null); // Центрирует окно

        // Загружаем изображение
        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel label = new JLabel(imageIcon);

        // Добавляем метку с изображением в окно
        add(label);
    }

    public static void main(String[] args) {

        String imagePath = "/Users/xx7mch/Downloads/крот.jpg";

        // Создаем и отображаем окно
        SwingUtilities.invokeLater(() -> {
            ImageDisplay frame = new ImageDisplay(imagePath);
            frame.setVisible(true);
        });
    }
}
