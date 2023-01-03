package DZ2;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.next();
        if (input.isEmpty()) {
            scanner.close();
            throw new RuntimeException("пустые строки вводить нельзя");
        }
        System.out.println(input);
    }
}
