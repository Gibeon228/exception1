package DZ1;

import com.sun.tools.javac.Main;

public class Task1 {
    public static void main(String[] args) {
        division(5, 0);
        int[] array2 = {2, 5, 1};
        int[] array1 = {2, 5};
        int[] array5 = null;
        array3(array2, array1);
        array3(array2, array5);
    }

    public static int division(int a, int b) {
//        if (b == 0) {
//            throw new RuntimeException("Делить на 0 нельзя");
//        }
        return a / b;
    }
    public static int[] array3(int[] array2, int[] array1) {
        for (int i = 0; i < array2.length; i++) {
            array1[i] += array2[i];
        }
        return array1;
    }
}
