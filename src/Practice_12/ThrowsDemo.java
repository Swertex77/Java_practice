package Practice_12;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = null;

        while (true) { // Цикл для повторного ввода
            System.out.print("Введите ключ: ");
            key = myScanner.next();
            try {
                printDetails(key);
                break; // Если ввод успешен, выходим из цикла
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Попробуйте еще раз."); // Сообщение пользователю
            }
        }

        myScanner.close(); // Закрываем сканер после завершения ввода
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e; // Пробрасываем исключение дальше
        }
    }

    private String getDetails(String key) throws Exception { // Объявляем, что метод может выбросить Exception
        if (key.equals("")) { // Проверка на пустую строку
            throw new Exception("Ключ установлен в пустую строку");
        }
        return "данные для " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey(); // Запуск программы
    }
}





