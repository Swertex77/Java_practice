package Practice_15;

import java.util.ArrayList;
import java.util.Random;

public class ListUtils {

    // Метод для перетасовки элементов в ArrayList
    public static <E> void shuffle(ArrayList<E> list) {
        Random rand = new Random(); // Создаем генератор случайных чисел

        for (int i = list.size() - 1; i > 0; i--) {
            // Генерируем случайный индекс от 0 до i
            int j = rand.nextInt(i + 1);

            // Меняем местами элементы с индексами i и j
            E temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

    public static void main(String[] args) {
        // Пример использования метода shuffle
        ArrayList<String> items = new ArrayList<>();
        items.add("apple");
        items.add("banana");
        items.add("cherry");
        items.add("date");
        items.add("fig");

        System.out.println("Исходный список: " + items);

        shuffle(items); // Перетасовка списка

        System.out.println("Перетасованный список: " + items);
    }
}

