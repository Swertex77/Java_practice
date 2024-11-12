package Practice_9;

// Клиентский класс для измерения времени сортировки массива
public class TestStopWatch {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100000);
        }

        StopWatch stopwatch = new StopWatch();
        selectionSort(numbers);  // Сортировка массива методом выбора
        stopwatch.stop();

        System.out.println("Время выполнения сортировки: " + stopwatch.getElapsedTime() + " миллисекунд");
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
