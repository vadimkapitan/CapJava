package topic2Exceptions.task2InvalidAgeException;

/**
 * Содержит пользовательское исключение InvalidAgeException, наследуемое от Exception.
 * Имеет метод checkAge(int age), который выбрасывает InvalidAgeException, если возраст меньше 0 или больше 150.
 * В методе main вызывайте метод checkAge() и обрабатывайте исключение с помощью try-catch, выводя сообщение об ошибке.
 */

public class AgeChecker {
    public static void main(String[] args) {
        int age = 13;
        try {
            checkAge(age);
            System.out.println("Age " + age + " is correct.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age <= 0 || age > 150) {
            throw new InvalidAgeException("Input age is not correct.");
        }
    }
}
