//  1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//  и возвращает введенное значение.
//  Ввод текста вместо числа не должно приводить к падению приложения,
//  вместо этого, необходимо повторно запросить у пользователя ввод данных.

package homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        showFloatInput();
    }

    public static void showFloatInput() {
        boolean success = false;
        System.out.println("Введите дробное число (разделитель - точка): ");
        while (!success) {
            try {
                Scanner scanner = new Scanner(System.in);
                String inputString = scanner.nextLine();
                float num = Float.parseFloat(inputString);
                System.out.println("Вы ввели: " + num);
                success = true;

            } catch (InputMismatchException | NumberFormatException e) {
                System.out.print("Введено некорретное значение!\n\nВведите дробное число снова: ");
            }
        }
    }
}
