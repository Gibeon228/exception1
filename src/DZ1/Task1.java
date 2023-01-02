package DZ1;

import com.sun.tools.javac.Main;

public class Task1 {
    public static void main(String[] args) {
        division();
        array3();
        getLengthArray();
    }

    public static int division() {
        int a = 5;
        int b = 0;
        return a / b;
    }
    public static int[] array3() {
        int[] array2 = {2, 5, 1};
        int[] array1 = {2, 5};
        for (int i = 0; i < array2.length; i++) {
            array1[i] += array2[i];
        }
        return array1;
    }

    public static void getLengthArray() {
        int [] array1 = null;
        System.out.println(array1.length);
    }
}
