package Practice_15;

public class LinearSearch {

    // Метод для выполнения линейного поиска
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) { // Сравнение текущего элемента с искомым
                return i; // Возврат индекса найденного элемента
            }
        }
        return -1; // Если элемент не найден, возвращаем -1
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2}; // Пример массива
        int target = 4; // Элемент для поиска

        int result = linearSearch(numbers, target); // Вызов метода линейного поиска

        if (result != -1) {
            System.out.println("Элемент " + target + " найден на позиции: " + result);
        } else {
            System.out.println("Элемент " + target + " не найден.");
        }
    }
}