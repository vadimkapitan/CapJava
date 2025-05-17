package topic3Enums.task2Color;

/**
 * Создайте перечисление Color со следующими элементами:
 * RED, GREEN, BLUE
 * Каждый элемент должен иметь ассоциированный шестнадцатеричный код (например, "#FF0000" для RED, "#00FF00" для GREEN, " #0000FF" для BLUE).
 * Реализуйте:
 * Приватное поле hexCode (тип String).
 * Конструктор, принимающий строку.
 * Метод getHexCode(), возвращающий значение поля.
 * В классе ColorDemo создайте демонстрацию: выведите имя и шестнадцатеричный код для каждого цвета.
 */
public enum Color {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");

    private final String hexCode;

    Color(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }

}


