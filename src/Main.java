public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int[] getDifference(int[] array1, int[] array2) {
        if (array1 == null && array2 == null) {
            throw new RuntimeException("Оба массивы пустые");
        }
        if (array1 == null) {
            throw new RuntimeException("первый массив пустой");
        }
        if (array2 == null) {
            throw new RuntimeException("второй массив пустой");
        }
        if (array1.length != array2.length) {
            System.out.println("Размер массива 1 не равен размеру массива два, выберите действия:");
            System.out.println("1 - завершить работу программы");
            System.out.println("2 - произвести работу программы не изменяя последнии элементы большего по размеру массива");

        }

        return array1;
    }
}