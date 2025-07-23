package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        Random random = new Random();
        for (int i=0; i<n; i++) {
            numbers[i] = random.nextInt(10);
        }

        int count8 = 0;
        int count1 = 0;
        int countEven = 0;
        int countOdd = 0;
        int sum = 0;

        for (int i=0; i<n; i++) {
            if (numbers[i]>8) count8++;
            if (numbers[i] == 1) count1++;
            if (numbers[i]%2 == 0) {
                countEven++;
            } else countOdd++;
            sum = sum + numbers[i];
        }


        System.out.println("Длина массива = "+numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Количество чисел больше 8: " + count8);
        System.out.println("Количество чисел равных 1: " + count1);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }

}
