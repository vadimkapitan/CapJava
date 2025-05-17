package topic3Enums.task1Day;

/**
 * Создайте перечисление Day со следующими элементами:
 * MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
 * В классе DayDemo реализуйте метод main, который:
 * Вызывает метод values() у перечисления Day.
 * Выводит каждый день недели на новой строке.
 */

public class DayDemo {
    public static void main(String[] args) {
        values();
    }

    public static void values() {
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
