package Practice_15;

import java.util.ArrayList;
import java.util.List;

public class UniqueList {

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> uniqueList = new ArrayList<>(); // Новый список для уникальных элементов

        for (E element : list) {
            if (!uniqueList.contains(element)) { // Проверка на наличие элемента в уникальном списке
                uniqueList.add(element); // Добавление уникального элемента
            }
        }

        return uniqueList; // Возврат списка без дубликатов
    }

    public static void main(String[] args) {
        // Пример использования метода
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("apple"); // Дубликат
        originalList.add("orange");
        originalList.add("banana"); // Дубликат

        System.out.println("Исходный список: " + originalList);

        ArrayList<String> uniqueList = removeDuplicates(originalList);

        System.out.println("Список без дубликатов: " + uniqueList);
    }
}