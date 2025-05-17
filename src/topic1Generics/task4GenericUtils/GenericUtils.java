package topic1Generics.task4GenericUtils;

/**
 * Реализуйте класс GenericUtils с публичным статическим методом:
 * <T extends Comparable<T>> T max(T a, T b), который возвращает большее из двух значений, сравнивая их с помощью метода compareTo.
 * В классе GenericUtilsDemo протестируйте метод max для чисел и строк.
 */


public class GenericUtils {

    public static <T extends  Comparable<T>> T max(T a, T b){
        return a.compareTo(b) >= 0 ? a : b;
    }
}
