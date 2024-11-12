package Practice_8;

import javax.swing.*;
import java.awt.*;

public class ImagePanel {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Изображения на панели");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel imagePanel = new JPanel();

        ImageIcon image1 = new ImageIcon("/Users/xx7mch/Downloads/Енот.jpeg");
        JLabel label1 = new JLabel(image1);
        label1.setText("Изображение 1");
        label1.setForeground(Color.WHITE);
        label1.setHorizontalTextPosition(JLabel.CENTER);

        ImageIcon image2 = new ImageIcon("/Users/xx7mch/Downloads/Слон.jpeg");
        JLabel label2 = new JLabel(image2);
        label2.setText("Изображение 2");
        label2.setForeground(Color.WHITE);
        label2.setHorizontalTextPosition(JLabel.CENTER);

        imagePanel.add(label1);
        imagePanel.add(label2);

        frame.add(imagePanel);

        frame.setVisible(true);
    }
}
