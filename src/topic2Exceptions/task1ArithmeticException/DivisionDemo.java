package topic2Exceptions.task1ArithmeticException;

/**
 * Принимает два числа (например, заданы в коде).
 * Пытается выполнить операцию деления первого числа на второе.
 * Использует блок try-catch для обработки исключения ArithmeticException, возникающего при делении на ноль.
 * Выводит сообщение об ошибке, если делитель равен 0, или результат деления в противном случае.
 */

public class DivisionDemo {
    public static void main(String[] args) {


        int firstV = 3;
        int secondV = 3;

        try {
            int res = firstV / secondV;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя.");
        }
    }
}
