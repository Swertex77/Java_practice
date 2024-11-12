package Practice_8;

import javax.swing.*;

    public class HelloWorld {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Приложение");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JPanel panel = new JPanel();
            frame.add(panel);

            JLabel label = new JLabel("Привет МИР!");
            panel.add(label);

            frame.setVisible(true);
        }
    }
