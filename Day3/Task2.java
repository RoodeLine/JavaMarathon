package Day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        for ( ; ;) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите 2 числа: делимое и делитель");
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();

            if (number2 == 0) {
                System.out.println("Делить на 0 нельзя");
                break;
            }

            System.out.println(number1/number2);
        }
    }
}
