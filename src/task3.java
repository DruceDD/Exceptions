//3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращает новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {

        int[] array1 = new int[]{10, 14, 18};
//        int[] array2 = new int[]{5, 4, 8};
        int[] array2 = null;
        System.out.println(Arrays.toString(diffOfArrays(array1, array2)));

    }

    public static int[] diffOfArrays(int[] array1, int[] array2) {
        try {
            if (array1.length == array2.length) {
                int[] result = new int[array1.length];
                for (int i = 0; i < array1.length; i++) {
                    result[i] = array1[i] - array2[i];
                }
                return result;
            } else throw new RuntimeException("Разная длина массивов");
        } catch (NullPointerException e) {
            throw new RuntimeException("Какой-то из массивов нулевой");
        }
    }
}
