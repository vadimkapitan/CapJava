package topic3Enums.task5Operation;

/**
 * Создайте перечисление Operation с элементами:
 * PLUS, MINUS, TIMES, DIVIDE
 * Каждая константа должна переопределять метод:
 * apply(double x, double y) — возвращает результат соответствующей операции.
 * В классе OperationDemo протестируйте каждую операцию, передавая два числа и выводя результат.
 */

public enum Operation {

    PLUS {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },

    MINUS {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },

    TIMES {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },

    DIVIDE {
        @Override
        public double apply(double x, double y) {
            if (y == 0 || y < 0) {
                throw new RuntimeException("Делить на ноль нельзя");
            }
            return x / y;
        }
    };


    public abstract double apply(double x, double y);

}
