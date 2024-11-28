package Practice_13;

public class CountKDigitNumbers {

    public static void main(String[] args) {
        int k = 3;
        int s = 6;
        int result = countNumbers(k, s);
        System.out.println("Количество " + k + "-значных чисел с суммой " + s + ": " + result);
    }

    public static int countNumbers(int k, int s) {
        return countRecursive(0, 0, k, s);
    }

    private static int countRecursive(int pos, int currentSum, int k, int s) {
        // Если достигли нужной длины
        if (pos == k) {
            return currentSum == s ? 1 : 0;
        }

        int totalCount = 0;
        // Перебираем возможные цифры
        int start = (pos == 0) ? 1 : 0; // Первая цифра не может быть 0
        for (int digit = start; digit <= 9; digit++) {
            if (currentSum + digit <= s) { // Проверяем, не превышает ли сумма
                totalCount += countRecursive(pos + 1, currentSum + digit, k, s);
            }
        }

        return totalCount;
    }
}
