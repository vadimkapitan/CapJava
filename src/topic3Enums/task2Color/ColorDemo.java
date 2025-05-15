package topic3Enums.task2Color;

import java.util.Arrays;

public class ColorDemo {
    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color + ": " + color.getHexCode());
        }
    }
}
