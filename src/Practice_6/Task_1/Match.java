package Practice_6.Task_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match {

    private static int milanScore = 0;
    private static int madridScore = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("AC Milan VS Real Madrid");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(200, 300));

        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");

        JLabel label1 = new JLabel("Result: 0 X 0");
        JLabel label2 = new JLabel("Last Scorer: N/A");
        JLabel label3 = new JLabel("Winner: DRAW");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                label1.setText("Result: " + milanScore + " X " + madridScore);
                label2.setText("Last Scorer: AC Milan");
                updateWinner(label3);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                label1.setText("Result: " + milanScore + " X " + madridScore);
                label2.setText("Last Scorer: Real Madrid");
                updateWinner(label3);
            }
        });

        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

     static void updateWinner(JLabel label) {
        if (milanScore > madridScore) {
            label.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            label.setText("Winner: Real Madrid");
        } else {
            label.setText("Winner: DRAW");
        }
    }
}