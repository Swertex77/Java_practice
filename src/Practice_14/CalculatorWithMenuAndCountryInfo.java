package Practice_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorWithMenuAndCountryInfo extends JFrame {
    private JTextField display = new JTextField(); // Экран калькулятора
    private StringBuilder currentInput = new StringBuilder(); // Для хранения текущего ввода
    private double result = 0;
    private String lastOperation = "="; // Последняя операция

    public CalculatorWithMenuAndCountryInfo() {
        super("Calculator with Menu and Country Info");
        setLayout(new BorderLayout());

        // Настройка текстового поля
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        // Создание кнопок калькулятора
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4)); // 4 строки на 4 колонки

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        // Создаем меню
        JMenuBar menuBar = new JMenuBar();

        // Меню Файл
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0)); // Выход из программы

        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Меню Правка
        JMenu editMenu = new JMenu("Edit");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem pasteItem = new JMenuItem("Paste");

        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);

        // Меню Справка
        JMenu helpMenu = new JMenu("Help");

        // Меню стран
        JMenu countryMenu = new JMenu("Country Info");
        JMenuItem countryInfoItem = new JMenuItem("Select Country");
        countryInfoItem.addActionListener(e -> {
            String[] countries = {"Australia", "China", "England", "Russia"};
            String selectedCountry = (String) JOptionPane.showInputDialog(
                    this,
                    "Select a country:",
                    "Country Info",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    countries,
                    countries[0]);

            if (selectedCountry != null) {
                String info = getCountryInfo(selectedCountry);
                JOptionPane.showMessageDialog(this, info, "Country Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        countryMenu.add(countryInfoItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        menuBar.add(countryMenu);

        setJMenuBar(menuBar); // Устанавливаем меню

        setSize(300, 400); // Устанавливаем размер окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Обработчик событий для кнопок
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if ("0123456789.".contains(command)) {
                currentInput.append(command);
                display.setText(currentInput.toString());
            } else {
                performOperation(command);
            }
        }

        private void performOperation(String command) {
            try {
                double input = currentInput.length() > 0 ? Double.parseDouble(currentInput.toString()) : result;

                switch (lastOperation) {
                    case "+" -> result += input;
                    case "-" -> result -= input;
                    case "*" -> result *= input;
                    case "/" -> result /= input;
                    case "=" -> result = input;
                }

                if (command.equals("=")) {
                    display.setText(String.valueOf(result));
                } else {
                    display.setText("");
                }

                lastOperation = command;
                currentInput.setLength(0); // Очистить текущее число
            } catch (NumberFormatException ex) {
                display.setText("Error");
            }
        }
    }

    // Метод для получения информации о стране
    private String getCountryInfo(String country) {
        return switch (country) {
            case "Australia" -> "Australia is known for its beautiful beaches and unique wildlife.";
            case "China" -> "China is famous for its rich history and the Great Wall.";
            case "England" -> "England is known for its historic landmarks and cultural heritage.";
            case "Russia" -> "Russia is the largest country in the world with vast landscapes.";
            default -> "Information not available.";
        };
    }

    public static void main(String[] args) {
        new CalculatorWithMenuAndCountryInfo();
    }
}

