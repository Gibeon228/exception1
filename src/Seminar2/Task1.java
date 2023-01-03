package Seminar2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter index: ");
        String input = scanner.next();
        if (!input.matches("\\d+")) {  //проверка является ли строка числом (если вы ввели не число, то
            System.out.println("Enter number: "); //требуем, чтобы ввели число
            return;
        }

        int index = Integer.parseInt(input);
        if (index >= arr.length) {
            System.out.println("Индекс за пределами массива");
            return;
        }

        System.out.println(arr[index]);
    }
}
