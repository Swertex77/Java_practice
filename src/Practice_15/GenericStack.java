package Practice_15;

public class GenericStack<E> {
    private E[] array; // Массив для хранения элементов стека
    private int size;  // Текущий размер стека
    private static final int INITIAL_CAPACITY = 10; // Начальная емкость массива

    // Конструктор
    @SuppressWarnings("unchecked")
    public GenericStack() {
        array = (E[]) new Object[INITIAL_CAPACITY]; // Инициализация массива
        size = 0; // Установка начального размера
    }

    // Получение текущего размера стека
    public int getSize() {
        return size;
    }

    // Получение верхнего элемента стека без его удаления
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return array[size - 1];
    }

    // Добавление нового элемента в стек
    public void push(E o) {
        if (size == array.length) { // Проверка заполненности массива
            resize(); // Увеличение размера массива
        }
        array[size++] = o; // Добавление элемента и увеличение размера
    }

    // Удаление верхнего элемента стека и его возврат
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        E o = array[--size]; // Получение верхнего элемента и уменьшение размера
        array[size] = null; // Удаление ссылки на объект для сборщика мусора
        return o;
    }

    // Проверка, пуст ли стек
    public boolean isEmpty() {
        return size == 0;
    }

    // Увеличение размера массива вдвое
    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = array.length * 2; // Новый размер массива
        E[] newArray = (E[]) new Object[newCapacity]; // Создание нового массива
        System.arraycopy(array, 0, newArray, 0, size); // Копирование элементов в новый массив
        array = newArray; // Замена старого массива на новый
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("стек: [");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

