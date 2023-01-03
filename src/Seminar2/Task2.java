package Seminar2;

public class Task2 {
    public static void main(String[] args) {
        String[][] array = {{"1", "1"}, {"-1", "q"}};
        System.out.println(sum2d(array));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].matches("-?\\d+")) { // Если элемент массива число (включая знак)
                    sum += Integer.parseInt(arr[i][j]);
                }
            }
        }
        return sum;
    }
}
