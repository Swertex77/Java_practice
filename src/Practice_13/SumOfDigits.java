package Practice_13;

public class SumOfDigits {

    public static void main(String[] args) {
        int N = 12345; // Пример числа
        int sum = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна: " + sum);
    }

    public static int sumOfDigits(int N) {
        // Базовый случай: если N равно 0, сумма равна 0
        if (N == 0) {
            return 0;
        }

        return (N % 10) + sumOfDigits(N / 10);
    }
}
