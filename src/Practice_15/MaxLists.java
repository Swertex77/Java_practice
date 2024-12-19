package Practice_15;

import java.util.ArrayList;

public class MaxLists {

    // Метод для нахождения наибольшего элемента в ArrayList
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не должен быть пустым."); // Проверка на пустой список
        }

        E maxElement = list.get(0); // Предполагаем, что первый элемент - максимальный

        for (E element : list) {
            if (element.compareTo(maxElement) > 0) { // Сравнение текущего элемента с максимальным
                maxElement = element; // Обновление максимального элемента
            }
        }

        return maxElement; // Возврат наибольшего элемента
    }

    public static void main(String[] args) {
        // Пример использования метода max
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);

        Integer maxNumber = max(numbers); // Нахождение наибольшего элемента

        System.out.println("Наибольший элемент: " + maxNumber);
    }
}
