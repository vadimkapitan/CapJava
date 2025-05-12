package topic1Generics.task2ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtilsDemo {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));

        ArrayUtils.swap(array, 1, 3);

        System.out.println(Arrays.toString(array));

    }
}
