package Practice_6.Task_4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AnimatedImage extends JFrame {
    private JLabel imageLabel;
    private ImageIcon[] frames;
    private int currentFrame = 0;

    public AnimatedImage() {
        setTitle("Animated Image");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Инициализация массива кадров
        frames = new ImageIcon[3];

        // Задаем пути к кадрам
        frames[0] = new ImageIcon("/Users/xx7mch/Downloads/крот.jpg");
        frames[1] = new ImageIcon("/Users/xx7mch/Downloads/Слон.jpeg");
        frames[2] = new ImageIcon("/Users/xx7mch/Downloads/Енот.jpeg");

        // Проверяем существование файлов
        for (ImageIcon frame : frames) {
            if (frame.getIconWidth() == -1) { // Если изображение не загружено
                System.err.println("Image not found: " + frame.getDescription());
            }
        }

        imageLabel = new JLabel(frames[currentFrame]);
        add(imageLabel);

        // Таймер для анимации
        Timer timer = new Timer(1000, new ActionListener() { // 1000 мс = 1 секунда
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length; // Переход к следующему кадру
                imageLabel.setIcon(frames[currentFrame]);
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AnimatedImage frame = new AnimatedImage();
            frame.setVisible(true);
        });
    }
}