package Practice_15;

import java.util.Scanner;

public class TestGenericStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>();

        // Запрос строк у пользователя
        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            stack.push(input); // Добавление строки в стек
        }

        // Отображение строк в обратном порядке
        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // Удаление и вывод верхнего элемента стека
        }

        scanner.close();
    }
}

