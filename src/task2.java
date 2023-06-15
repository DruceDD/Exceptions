//2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

public class task2 {
    public static void main(String[] args) {

        String[][] array = new String[][]{
                {"1s","1","1"},
                {"1","1","1"},
                {"1","1","1"},
                {"1","1","1"},
                {"1","1","1"}
        };
//        String[][] array = null;

        System.out.println("Сумма элементов двумерного массива: " + sum2d(array));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}

// Возможные исключения:
// ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
// NullPointerException: Cannot read the array length because "arr" is null
// NumberFormatException: For input string: "1s"