package topic2Exceptions.task4MultiExceptionDemo;

/**
 * Создаёт массив из нескольких элементов и пытается обратиться к элементу по индексу, выходящему за пределы массива.
 * Пытается вызвать метод у объекта, равного null.
 * Использует конструкцию мульти-catch (catch (Exception1 | Exception2 e)) для перехвата ArrayIndexOutOfBoundsException и NullPointerException.
 * Выводит сообщение об ошибке.
 */

public class MultiExceptionDemo {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        String text = null;

        try {
            System.out.println(array[1]);
            System.out.println(text.length());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Исключение: " + e.getClass().getSimpleName());
        }
    }
}
