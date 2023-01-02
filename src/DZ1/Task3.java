package DZ1;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {3, 5, 6};
        int[] array2 = {31, 4, 5};
        int[] array3 = getQuotient(array1, array2);

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + ", ");
        }
    }
    public static int[] getQuotient(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            throw new RuntimeException("Массив не может быть null");
        }
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов должны быть равны");
        }

        int[] array3 = new int [array1.length];
        for (int i = 0; i < array1.length; i++){
            if (array2[i] == 0) throw new RuntimeException("Элемент массива равен '0'");
            array3[i] = array1[i] / array2[i];
        }
        return array3;
    }

}
