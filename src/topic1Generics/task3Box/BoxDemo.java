package topic1Generics.task3Box;

public class BoxDemo {
    public static void main(String[] args) {

        Box<Integer> box = new Box<>();
        box.setT(13);
        System.out.println("В коробке Integer, находится: " + box.getT());

        Box<String> box1 = new Box<>();
        box1.setT("Hello");
        System.out.println("В коробке String, находится: " + box1.getT());

        box.setT(32);
        System.out.println(box.getT());

        box1.setT("Hi");
        System.out.println(box1.getT());



    }
}
