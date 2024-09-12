package Practice_1;

// Задание 1 Исправление ошибки
public class A {
    String s;

   A(String newS) {
        s = newS;
    }

    public void print() {
        System.out.print(s);
    }
}
class TestA {
    public static void main(String[] args) {
        A a = new A("Hello All!");
        a.print();
    }
}

/**
 * Ошибка в строке 15, отсутствуют аргументы в конструкторе класса Practice_1.A, требуется строковый параметр newS
 */

