package topic1Generics.task2ArrayUtils;

/**
 * Реализуйте класс ArrayUtils с публичным статическим параметризованным методом:
 * swap(T[] array, int i, int j) — меняет местами элементы массива по индексам i и j.
 * В классе ArrayUtilsDemo продемонстрируйте работу метода swap на примере массива (например, из чисел или строк).
 */

public class ArrayUtils {

    public static <T> void swap(T[] array, int i, int j){
        T value = array[i];
        array[i] = array[j];
        array[j] = value;
    }
}
