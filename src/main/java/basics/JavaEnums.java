package basics;

import java.util.Arrays;

public class JavaEnums {

    enum Color {
        RED, BLACK, GREEN
    }

    public static void main(String[] args) {
        Color enum1 = Color.GREEN;
        System.out.println("Enum => " + enum1);

        // Methods of enums
        // 1. Values
        Color[] values = Color.values();
        System.out.println("Values => "+ Arrays.toString(values));

        // 2. ValueOf:
        Color red = Color.valueOf("RED");
        System.out.println("ValueOf => " + red);

    }

}
