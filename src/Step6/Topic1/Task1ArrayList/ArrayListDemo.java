package Step6.Topic1.Task1ArrayList;
import java.util.ArrayList;
import java.util.List;

/**
 * Инициализирует ArrayList.
 * Добавляет в него несколько чисел.
 * Удаляет один из элементов (например, число 20).
 * Перебирает элементы с помощью цикла for-each.
 * Выводит оставшиеся элементы на экран.
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(20);
        list.add(36);

        for (Integer arr : list) {
            System.out.print(arr + " ");
        }
        System.out.println(" ");

        list.remove(Integer.valueOf(20));

        for (Integer number : list) {
            System.out.print(number + " ");
        }

    }
}
