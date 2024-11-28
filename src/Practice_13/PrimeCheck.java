package Practice_13;

public class PrimeCheck {

    public static void main(String[] args) {
        int n = 29;
        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPrime(int n, int divisor) {
        // Базовый случай: если делитель больше квадратного корня n
        if (divisor * divisor > n) {
            return true; // n является простым
        }
        // Проверка делимости
        if (n % divisor == 0) {
            return false; // n составное
        }
        return isPrime(n, divisor + 1);
    }
}