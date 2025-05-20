package Step6.Topic1.Task2LinkedList;

import java.util.LinkedList;

/**
 * Инициализирует LinkedList.
 * Добавляет элементы (например, "One", "Two", "Three").
 * Использует методы addFirst() и addLast() для добавления элементов в начало и конец.
 * Удаляет элементы с помощью removeFirst() и removeLast().
 * Выводит оставшиеся элементы с помощью цикла for-each.
 */

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println(linkedList);
        System.out.println(" ");

        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");

        for (String list : linkedList){
            System.out.println(list + " ");
        }

        System.out.println(" ");

        linkedList.addFirst("Four");
        linkedList.addLast("Five");

        for (String list : linkedList){
            System.out.println(list + " ");
        }

        System.out.println(" ");

        linkedList.removeFirst();
        linkedList.removeLast();

        for (String list : linkedList){
            System.out.println(list + " ");
        }
    }
}
