package topic2Exceptions.task5Finally;

/**
 * Симулирует открытие ресурса (например, через вывод сообщения "Ресурс открыт").
 * Выполняет операцию, которая может выбросить исключение (например, деление на 0).
 * В блоке finally выводит сообщение "Ресурс закрыт" для имитации освобождения ресурса.
 */

public class FinallyDemo {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;

        System.out.println("Ресурс открыт.");
        try {
            int res = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Ресурс закрыт.");
        }
    }
}
