package topic1Generics.task3Box;

/**
 * Реализуйте класс Box<T>, который имеет одно приватное поле типа T. Класс должен содержать:
 * Конструктор без параметров.
 * Метод set(T value) для установки значения.
 * Метод get() для получения значения.
 * В классе BoxDemo создайте объект Box для хранения строки или числа, измените его значение и выведите на экран.
 */

public class Box<T> {
    private T t;

    public Box() {
    }

    public T getT() {
        return t;
    }

    public void setT(T value) {
        this.t = value;
    }
}
