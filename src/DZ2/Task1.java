package DZ2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getNumberFloat());
    }
    public static float getNumberFloat() {
        System.out.println("Enter number with type float: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String floatPattern = "([+-]?(\\d+\\.)?\\d+)";
        while (!input.matches(floatPattern)) {
            System.out.println("Введён неверный формат: " + input);
            System.out.println("Enter number with type float: ");
            input = scanner.nextLine();
        }
        return Float.parseFloat(input);
    }
}
