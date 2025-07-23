package Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите 2 числа: делимое и делитель");
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();

            if (number2 == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(number1 / number2);
        }
    }
}