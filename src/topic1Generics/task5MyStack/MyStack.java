package topic1Generics.task5MyStack;

import java.util.ArrayList;

/**
 * Реализуйте класс MyStack<T> с приватным полем для хранения элементов (например, ArrayList). Класс должен содержать методы:
 * push(T element) для добавления элемента.
 * pop() для удаления и возврата верхнего элемента.
 * peek() для возврата верхнего элемента без удаления.
 * isEmpty() для проверки, пуст ли стек.
 * В классе MyStackDemo продемонстрируйте работу стека, добавив несколько элементов, затем извлекая их.
 */

public class MyStack<T> {

    private ArrayList<T> list = new ArrayList<>();


    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeLast();
    }

    public T peek() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
