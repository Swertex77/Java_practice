package Practice_15;

import java.util.ArrayList;

public class ListSorts {

    // Метод для сортировки элементов в ArrayList
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        for (int i = 1; i < list.size(); i++) {
            E key = list.get(i); // Текущий элемент для вставки
            int j = i - 1;

            // Сдвигаем элементы, которые больше ключа, на одну позицию вперед
            while (j >= 0 && list.get(j).compareTo(key) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key); // Вставляем ключ на правильную позицию
        }
    }

    public static void main(String[] args) {
        // Пример использования метода sort
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);

        System.out.println("Исходный список: " + numbers);

        sort(numbers); // Сортировка списка

        System.out.println("Отсортированный список: " + numbers);
    }
}

