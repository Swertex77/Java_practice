package Practice_15;

import java.util.Objects;

public class Triplet<A extends Comparable<A>> {
    private final A first;
    private final A second;
    private final A third;

    // Конструктор
    public Triplet(A first, A second, A third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // Метод для проверки наличия объекта в кортеже
    public boolean contains(A element) {
        return Objects.equals(first, element) ||
                Objects.equals(second, element) ||
                Objects.equals(third, element);
    }

    // Метод для определения наименьшего элемента в кортеже
    public A min() {
        if (first == null || second == null || third == null) {
            throw new IllegalArgumentException("Элементы не должны быть null");
        }

        A min = first; // Предполагаем, что первый элемент - минимальный

        if (second.compareTo(min) < 0) {
            min = second; // Обновляем минимальный элемент
        }

        if (third.compareTo(min) < 0) {
            min = third; // Обновляем минимальный элемент
        }

        return min; // Возврат наименьшего элемента
    }

    // Метод для сложения элементов кортежа
    public String sum() {
        if (first instanceof Number && second instanceof Number && third instanceof Number) {
            double sum = ((Number) first).doubleValue() +
                    ((Number) second).doubleValue() +
                    ((Number) third).doubleValue();
            return String.valueOf(sum);
        } else {
            return first.toString() + " " + second.toString() + " " + third.toString();
        }
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }

    public static void main(String[] args) {
        Triplet<Integer> intTriplet = new Triplet<>(1, 2, 3);
        System.out.println("Кортеж: " + intTriplet);
        System.out.println("Содержит 2? " + intTriplet.contains(2));
        System.out.println("Наименьший элемент: " + intTriplet.min());
        System.out.println("Сумма элементов: " + intTriplet.sum());

        Triplet<String> strTriplet = new Triplet<>("Hello", "World", "!");
        System.out.println("\nКортеж: " + strTriplet);
        System.out.println("Содержит 'World'? " + strTriplet.contains("World"));
        System.out.println("Наименьший элемент: " + strTriplet.min());
        System.out.println("Сумма элементов: " + strTriplet.sum());
    }
}

