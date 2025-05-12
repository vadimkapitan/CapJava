package topic1Generics.task4GenericUtils;

public class GenericUtilsDemo {
    public static void main(String[] args) {


        Integer max = GenericUtils.max(13, 23);
        System.out.println(max);

        String max1 = GenericUtils.max("hi", "Hello");
        System.out.println(max1);

    }
}
