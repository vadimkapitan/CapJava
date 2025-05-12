package topic1Generics.task1Pair;

public class PairDemo {
    public static void main(String[] args) {

        Pair<String,Integer> pair = new Pair<>("Ca",32);
        System.out.println(pair);


        pair.setFirst("Max");
        pair.setSecond(32);
        System.out.println(pair);
    }
}
