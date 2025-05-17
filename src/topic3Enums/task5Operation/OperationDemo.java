package topic3Enums.task5Operation;

public class OperationDemo {
    public static void main(String[] args) {

        for (Operation operation : Operation.values()){
            System.out.println(operation + ": " + operation.apply(10,2));
        }
    }
}
