package topic1Generics.task5MyStack;

public class MyStackDemo {
    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();

        stack.push(13);
        stack.push(14);
        stack.push(15);

        System.out.println(stack.peek());
        while (!stack.isEmpty()){
            System.out.println("Удален: " + stack.pop());
        }

    }
}
